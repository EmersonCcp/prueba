package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Trabajos;

public class TrabajosDAO implements IDAO_Trabajos {

    Connection con = null;
    ArrayList<Trabajos> lista = new ArrayList<>();
    Trabajos trabajosObj = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;

    public TrabajosDAO() {
        con = new Conexion().Conectar();
    }

    @Override
    public ArrayList listarTrabajo(String condicionM) {
        try {
            SSQL = "select * from trabajos";
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while(rs.next()){
                trabajosObj= new Trabajos(
                        rs.getInt("tra_codigo"),
                        rs.getString("tra_nombre"),
                        rs.getString("tra_fecha_entrega"),
                        rs.getString("tra_descripcion"),
                        rs.getInt("tra_costo"),
                        rs.getInt("tra_ganancia"),
                        rs.getInt("fk_cliente")
                );
                lista.add(trabajosObj);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en listar "+e);
        }
        return null;
    }

    @Override
    public void insertarTrabajo(Object objMaterial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarTrabajo(Object objMaterial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarTrabajo(Object objMaterial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarTrabajoDetalle(String condicionM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
