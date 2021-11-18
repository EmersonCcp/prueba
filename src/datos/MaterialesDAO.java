package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.scene.paint.Material;
import javax.swing.JOptionPane;
import modelo.FiltroMateriales;
import modelo.Materiales;

public class MaterialesDAO implements IDAO_Materiales {

    Connection con = null;
    ArrayList<Materiales> lista = new ArrayList<>();
    Materiales materialesObj = null;
    FiltroMateriales filtroMateriales = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;

    public MaterialesDAO() {
        con = new Conexion().Conectar();

    }

    @Override
    public ArrayList listarMaterial(String condicionM) {
        try {
            SSQL = "Select * from materiales " + condicionM;
            double suma=0;
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                materialesObj = new Materiales(
                        rs.getInt("ma_codigo"),
                        rs.getString("ma_nombre"),
                        rs.getDouble("ma_cantidad"),
                        rs.getDouble("ma_precio"),
                        rs.getString("ma_fecha_compra"),
                        rs.getString("ma_factura"),
                        rs.getInt("categoria_material"),
                        rs.getDouble("ma_precio_total")
                );
                suma= suma+ rs.getDouble("ma_precio_total");
                lista.add(materialesObj);
                
               

            }
            //JOptionPane.showMessageDialog(null, "LA cantidad total es "+suma);

            //Object objMaterial = null ;
            filtroMateriales = new FiltroMateriales();
        try {
            SSQL = "Update filtro_materiales SET precio_total_final=? where idFiltro=1";
            ps = con.prepareStatement(SSQL);
            
            ps.setDouble(1, suma);
            
            //ps.setInt(2, filtroMateriales.getIdFiltro());
            //JOptionPane.showMessageDialog(null, "Todo correcto!");
            ps.executeUpdate();
            
          

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el precio total final");

        }
            
            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en listar " + e);
        }
        return null;

    }

    @Override
    public void insertarMaterial(Object objMaterial) {
        materialesObj = (Materiales) objMaterial;
        SSQL = "Insert into materiales(ma_nombre,ma_cantidad,ma_precio,ma_fecha_compra,"
                + "ma_factura,categoria_material,ma_precio_total)values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(SSQL);
            ps.setString(1, materialesObj.getMa_nombre());
            ps.setDouble(2, materialesObj.getMa_cantidad());
            ps.setDouble(3, materialesObj.getPrecio());
            ps.setString(4, materialesObj.getMa_fecha_compra());
            ps.setString(5, materialesObj.getMa_factura());
            ps.setInt(6, materialesObj.getMa_categoria());
            ps.setDouble(7, materialesObj.getMa_precio_total());

            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha valida");
        }

    }

    @Override
    public void modificarMaterial(Object objMaterial) {
        materialesObj = (Materiales) objMaterial;
        try {
            SSQL = "Update materiales SET ma_nombre=?,ma_cantidad=?,ma_precio=?,"
                    + " ma_fecha_compra=?, ma_factura=?,categoria_material=?,ma_precio_total=?"
                    + " where ma_codigo=?";
            ps = con.prepareStatement(SSQL);

            ps.setString(1, materialesObj.getMa_nombre());

            ps.setDouble(2, materialesObj.getMa_cantidad());
            ps.setDouble(3, materialesObj.getPrecio());
            ps.setString(4, materialesObj.getMa_fecha_compra());
            ps.setString(5, materialesObj.getMa_factura());

            ps.setInt(6, materialesObj.getMa_categoria());

            ps.setDouble(7, materialesObj.getMa_precio_total());

            ps.setInt(8, materialesObj.getMa_codigo());
            // JOptionPane.showMessageDialog(null, "entra");
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en modificar " + e);
        }
    }

    @Override
    public void eliminarMAterial(Object objMaterial) {
        try {
            materialesObj = (Materiales) objMaterial;
            SSQL = "Delete from materiales where ma_codigo=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, materialesObj.getMa_codigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en eliminar " + e);
        }
    }

    @Override
    public void FiltrarMaterial(Object objMaterial) {
        filtroMateriales = (FiltroMateriales) objMaterial;
        try {
            SSQL = "Update filtro_materiales SET ma_fecha_inicio=?, ma_fecha_final=? where idFiltro=?";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, filtroMateriales.getMa_fecha_inicio());
            ps.setString(2, filtroMateriales.getMa_fecha_final());
            ps.setInt(3, filtroMateriales.getIdFiltro());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la fecha en formato XXXX-XX-XX ");

        }
    }
    
    
}
