
package controlador;

import datos.IDAO_Materiales;
import datos.MaterialesDAO;
import java.util.ArrayList;


public class MaterialesControl implements IDAO_Materiales{

    @Override
    public ArrayList listarMaterial(String condicionM) {
       return new MaterialesDAO().listarMaterial(condicionM);
    }

    @Override
    public void insertarMaterial(Object objMaterial) {
        new MaterialesDAO().insertarMaterial(objMaterial);
    }

    @Override
    public void modificarMaterial(Object objMaterial) {
        new MaterialesDAO().modificarMaterial(objMaterial);
    }

    @Override
    public void eliminarMAterial(Object objMaterial) {
       new MaterialesDAO().eliminarMAterial(objMaterial);
    }

    @Override
    public void FiltrarMaterial(Object objMaterial) {
        new MaterialesDAO().FiltrarMaterial(objMaterial);
    }
    
    
    
    
}
