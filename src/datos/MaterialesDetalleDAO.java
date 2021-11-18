
package datos;

import modelo.Filtro_Id_Trabajos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.MaterialesDetalle;


public class MaterialesDetalleDAO implements IDAO_MaterialesDetalle{
    Connection con = null;
    ArrayList<MaterialesDetalle> lista = new ArrayList<>();
    MaterialesDetalle mdObj = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;
    Filtro_Id_Trabajos fi_trabajosObj=null;

    public MaterialesDetalleDAO() {
        con = new Conexion().Conectar();
    }
    
    
    

    @Override
    public ArrayList listarMD(String condicionM) {
        try {
            double precio_total=0;
            SSQL="select a.md_codigo,a.md_material,a.md_cantidad,a.md_precio,a.md_precio_total from materiales_detalle a "+condicionM;
            //JOptionPane.showMessageDialog(null, SSQL);
            ps=con.prepareStatement(SSQL);
            rs=ps.executeQuery();
            while(rs.next()){
                mdObj=new MaterialesDetalle(
                        rs.getInt("md_codigo"),
                        rs.getString("md_material"),
                        rs.getDouble("md_cantidad"),
                        rs.getDouble("md_precio"),
                        rs.getDouble("md_precio_total")
                        
                );
                precio_total=precio_total+rs.getDouble("md_precio_total");
                lista.add(mdObj);
                
            }
            
            
            JOptionPane.showMessageDialog(null, "El total del total es: "+precio_total);
            return lista;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en listar "+e);
        }
        return null;
    }

    @Override
    public void insertarMD(Object objMaterial) {
        try {
            mdObj=(MaterialesDetalle) objMaterial;
            SSQL="Insert into materiales_detalle (md_material,md_cantidad,"
                    + "md_precio,md_precio_total,fk_trabajo) values(?,?,?,?,?)";
            ps=con.prepareStatement(SSQL);
            ps.setString(1, mdObj.getMd_material());
            ps.setDouble(2, mdObj.getMd_cantidad());
            ps.setDouble(3, mdObj.getMd_precio());
            ps.setDouble(4, mdObj.getMd_precio_total());
            ps.setInt(5, mdObj.getFk_trabajo());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "acaa");
            JOptionPane.showMessageDialog(null, "Material Registrado con Exito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en insertar /n"+e);
        }
    }

    @Override
    public void modificarMD(Object objMaterial) {
        try {
            mdObj=(MaterialesDetalle) objMaterial;
            SSQL = "Update materiales_detalle SET md_material=?,md_cantidad=?,md_precio=?,"
                    + "md_precio_total=?  where md_codigo=?";
            ps = con.prepareStatement(SSQL);

            ps.setString(1, mdObj.getMd_material());
            ps.setDouble(2, mdObj.getMd_cantidad());
            ps.setDouble(3, mdObj.getMd_precio());
            ps.setDouble(4, mdObj.getMd_precio_total());
           /* ps.setInt(5, mdObj.getFk_trabajo());
            JOptionPane.showMessageDialog(null, "este :"+mdObj.getFk_trabajo());*/
            ps.setInt(5, mdObj.getMd_codigo());
            

            // JOptionPane.showMessageDialog(null, "entra");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Material Modificado con exito!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en modificar "+e);
        }
    }

    @Override
    public void eliminarMD(Object objMaterial) {
        
        try {
            mdObj = (MaterialesDetalle) objMaterial;
            SSQL = "Delete from materiales_detalle where md_codigo=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, mdObj.getMd_codigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en eliminar material detalle" + e);
        }
    }

    
    
}
