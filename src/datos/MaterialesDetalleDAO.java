package datos;

import modelo.Filtro_Id_Trabajos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.MaterialesDetalle;

public class MaterialesDetalleDAO implements IDAO_MaterialesDetalle {

    Connection con = null;
    ArrayList<MaterialesDetalle> lista = new ArrayList<>();
    MaterialesDetalle mdObj = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;
    Filtro_Id_Trabajos fi_trabajosObj = null;

    public MaterialesDetalleDAO() {
        con = new Conexion().Conectar();
    }

    @Override
    public ArrayList listarMD(String condicionM, String condicionT) {
        try {
            double tra_costo = 0;
            double precio_total = 0;
            double tra_ganancia = 0;
            SSQL = "select a.md_codigo,a.md_material,a.md_cantidad,a.md_precio,a.md_precio_total "
                    + "from materiales_detalle a   " + condicionM;
            //JOptionPane.showMessageDialog(null, SSQL);
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                mdObj = new MaterialesDetalle(
                        rs.getInt("md_codigo"),
                        rs.getString("md_material"),
                        rs.getDouble("md_cantidad"),
                        rs.getDouble("md_precio"),
                        rs.getDouble("md_precio_total")
                );
                precio_total = precio_total + rs.getDouble("md_precio_total");
                lista.add(mdObj);

            }

            //JOptionPane.showMessageDialog(null, "El total del total es: "+precio_total);
            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en listar MD" + e);
        }
        return null;
    }

    @Override
    public void insertarMD(Object objMaterial) {
        try {
            mdObj = (MaterialesDetalle) objMaterial;
            SSQL = "Insert into materiales_detalle (md_material,md_cantidad,"
                    + "md_precio,md_precio_total,fk_trabajo) values(?,?,?,?,?)";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, mdObj.getMd_material());
            ps.setDouble(2, mdObj.getMd_cantidad());
            ps.setDouble(3, mdObj.getMd_precio());
            ps.setDouble(4, mdObj.getMd_precio_total());
            ps.setInt(5, mdObj.getFk_trabajo());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "acaa");
            JOptionPane.showMessageDialog(null, "Material Registrado con Exito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en insertar /n" + e);
        }
    }

    @Override
    public void modificarMD(Object objMaterial) {
        try {
            mdObj = (MaterialesDetalle) objMaterial;
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
            JOptionPane.showMessageDialog(null, "Error en modificar " + e);
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

    @Override
    public void ModificarGananciasTrabajos(String condicion) {
        double precio_total = 0;
        try {
            SSQL = "SELECT md_precio_total from materiales_detalle WHERE fk_trabajo=" + condicion;
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                precio_total = precio_total+rs.getDouble("md_precio_total");
            }
            JOptionPane.showConfirmDialog(null, precio_total);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo en modificarganancias " + e);
        }

        double tra_costo = 0;
        try {
            SSQL = "SELECT tra_costo from trabajos WHERE tra_codigo=" + condicion;
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while(rs.next()){
                tra_costo = tra_costo + rs.getDouble("tra_costo");
            }
            JOptionPane.showConfirmDialog(null, tra_costo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo en modificarganancias TRA_COSTO" + e);
        }

        try {
            SSQL = "UPDATE trabajos SET tra_ganancia=? where tra_codigo=" + condicion;
            double ganancias = tra_costo - precio_total;
            ps = con.prepareStatement(SSQL);
            ps.setDouble(1, ganancias);
            ps.executeUpdate();
            JOptionPane.showConfirmDialog(null, ganancias);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo en modificarganancias Ganancias" + e);
        }

    }

}
