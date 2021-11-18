package datos;

import modelo.Filtro_Id_Trabajos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import modelo.Trabajos;

public class TrabajosDAO implements IDAO_Trabajos {

    Connection con = null;
    ArrayList<Trabajos> lista = new ArrayList<>();
    Trabajos trabajosObj = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;
    Filtro_Id_Trabajos fi_trabajosObj=null;

    public TrabajosDAO() {
        con = new Conexion().Conectar();
    }

    @Override
    public ArrayList listarTrabajo(String condicionM) {
        try {
            SSQL = "select * from trabajos "+condicionM;
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                trabajosObj = new Trabajos(
                        rs.getInt("tra_codigo"),
                        rs.getString("tra_nombre"),
                        rs.getString("tra_fecha_entrega"),
                        rs.getString("tra_descripcion"),
                        rs.getDouble("tra_costo"),
                        rs.getDouble("tra_ganancia"),
                        rs.getInt("fk_cliente")
                );
                lista.add(trabajosObj);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en listar " + e);
        }
        return null;
    }

    @Override
    public void insertarTrabajo(Object objTrabajo) {
        trabajosObj = (Trabajos) objTrabajo;
        SSQL = "insert into trabajos(tra_nombre,tra_fecha_entrega,tra_descripcion,tra_costo,tra_ganancia,fk_cliente) values (?,?,?,?,?,?)";
        try {
           ps=con.prepareStatement(SSQL);
           
           ps.setString(1, trabajosObj.getTra_nombre());
           ps.setString(2, trabajosObj.getTra_fecha_entrega());
           ps.setString(3, trabajosObj.getTra_descripcion());
           ps.setDouble(4, trabajosObj.getTra_costo());
           ps.setDouble(5, trabajosObj.getTra_ganancia());
           ps.setInt(6, trabajosObj.getFk_cliente());
           
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "aca entra");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Debe agregar la fecha AAAA-MM-DD ");
        }
    }

    @Override
    public void modificarTrabajo(Object objMaterial) {
        try {
            trabajosObj=(Trabajos) objMaterial;
            SSQL="UPDATE trabajos SET tra_nombre=?, tra_fecha_entrega=?, tra_descripcion=?, tra_costo=?, tra_ganancia=?, fk_cliente=? "
                    + " where tra_codigo=?";
            ps=con.prepareStatement(SSQL);
            ps.setString(1, trabajosObj.getTra_nombre());
            ps.setString(2, trabajosObj.getTra_fecha_entrega());
            ps.setString(3, trabajosObj.getTra_descripcion());
            ps.setDouble(4, trabajosObj.getTra_costo());
            ps.setDouble(5, trabajosObj.getTra_ganancia());
            ps.setInt(6, trabajosObj.getFk_cliente());
            ps.setInt(7, trabajosObj.getTra_codigo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Trabajo Modificado con Exito!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en modificar trabajo "+e);
        }
    }

    @Override
    public void eliminarTrabajo(Object objMaterial) {
        try {
            trabajosObj=(Trabajos) objMaterial;
            SSQL="DELETE FROM trabajos where tra_codigo=?";
            ps=con.prepareStatement(SSQL);
            ps.setInt(1, trabajosObj.getTra_codigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en eliminar de trabajo "+e);
        }
    }

    @Override
    public int FiltrarIdTrabajo(Object id) {
        try {
            fi_trabajosObj=(Filtro_Id_Trabajos) id;
            SSQL="Update filtro_id_trabajo SET fi_codigo=? where fi_trabajo=?";
            ps=con.prepareStatement(SSQL);
            ps.setInt(1, fi_trabajosObj.getFi_codigo());
            ps.setInt(2, fi_trabajosObj.getFi_trabajo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El codigo es: "+fi_trabajosObj.getFi_codigo());
            int i=fi_trabajosObj.getFi_codigo();
            return i;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en filtrar id del trabajo");
        }
        return 0;
    }

}
