
package datos;

import java.util.ArrayList;


public interface IDAO_TrabajosMateriales {
    public ArrayList listar(String condicion);
    public void insertar(Object obj);
    public void modificar(Object obj);
    public void eliminar(Object obj);
    
    
}
