
package controlador;

import datos.IDAO_Usuarios;
import datos.UsuariosDAO;


public class UsuariosControl implements IDAO_Usuarios{

    @Override
    public int Comprobar(String usuario, String contraseña) {
        return new UsuariosDAO().Comprobar(usuario, contraseña);
    }

    
    
}
