/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.TrabajosMateriales;

/**
 *
 * @author Gabriel
 */
public class TrabajosMaterialesDAO implements IDAO_TrabajosMateriales{
    Connection con=null;
    ArrayList<TrabajosMateriales> lista=new ArrayList<>();
    TrabajosMateriales tmObj=null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;

    public TrabajosMaterialesDAO() {
        con=new Conexion().Conectar();
    }
    
    
    @Override
    public ArrayList listar(String condicion) {
        try {
            SSQL="select * from trabajos_materiales "+condicion;
            ps=con.prepareStatement(SSQL);
            rs=ps.executeQuery();
            while(rs.next()){
                tmObj=new TrabajosMateriales(
                        rs.getInt("tm_codigo"),
                        rs.getString("tm_material"),
                        rs.getInt("tm_cantidad"),
                        rs.getInt("tm_precio"),
                        rs.getInt("tm_precio_total")
                );
                lista.add(tmObj);
            }
            return lista;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en listar detalles del trabajo");
        }
        return null;
    }

    @Override
    public void insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
