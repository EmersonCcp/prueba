
package datos;

import java.util.ArrayList;


public interface IDAO_MaterialesDetalle {
    public ArrayList listarMD(String condicionM);
    public void insertarMD(Object objMaterial);
    public void modificarMD(Object objMaterial);
    public void eliminarMD(Object objMaterial);
    
 
}
