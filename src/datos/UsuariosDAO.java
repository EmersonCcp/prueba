package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Materiales;
import modelo.Usuarios;
import vista.FrmInicioSesion;
import vista.FrmPrincipal;

public class UsuariosDAO implements IDAO_Usuarios {

    PreparedStatement ps;
    ResultSet rs;
    Usuarios usuarioObj = null;
    Connection con = null;
    String SSQL;
    ArrayList<Usuarios> lista = new ArrayList<>();
    FrmPrincipal frmPrincipal = new FrmPrincipal();
    FrmInicioSesion frmInicioSesion = new FrmInicioSesion();

    public UsuariosDAO() {
        con = new Conexion().Conectar();
    }

    @Override
    public int Comprobar(String usuario, String contraseña) {
        int validacion=0;
        try {
            
            SSQL = "SELECT * FROM usuarios";
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarioObj = new Usuarios(
                        rs.getInt("usu_codigo"),
                        rs.getString("usu_user"),
                        rs.getString("usu_nombre"),
                        rs.getString("usu_apellido"),
                        rs.getString("usu_direccion"),
                        rs.getString("usu_contraseña"),
                        rs.getString("usu_telefono")
                );
                lista.add(usuarioObj);

            }

            if (usuarioObj.getUsuario().equals(usuario) && usuarioObj.getContraseña().equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                frmInicioSesion.setVisible(false);
                frmPrincipal.setVisible(true);
                validacion=1;
                return validacion;
                

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña invalida!!");
                return validacion;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña invalida");
        }
        return validacion;

    }

}
