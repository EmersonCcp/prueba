
package controlador;

import datos.IDAO_TrabajosMateriales;
import datos.TrabajosMaterialesDAO;
import java.util.ArrayList;


public class TMControl implements IDAO_TrabajosMateriales{

    @Override
    public ArrayList listar(String condicion) {
        return new TrabajosMaterialesDAO().listar(condicion);
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
