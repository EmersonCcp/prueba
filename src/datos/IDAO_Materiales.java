
package datos;

import java.util.ArrayList;


public interface IDAO_Materiales {
    
    public ArrayList listarMaterial(String condicionM);
    public void insertarMaterial(Object objMaterial);
    public void modificarMaterial(Object objMaterial);
    public void eliminarMAterial(Object objMaterial);
    public void FiltrarMaterial(Object objMaterial);
        
    
    
}
