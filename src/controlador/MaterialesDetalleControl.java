/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.IDAO_MaterialesDetalle;
import datos.MaterialesDetalleDAO;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class MaterialesDetalleControl implements IDAO_MaterialesDetalle{

    @Override
    public ArrayList listarMD(String condicionM,String condicionT) {
        return new MaterialesDetalleDAO().listarMD(condicionM,condicionT);
    }

    @Override
    public void insertarMD(Object objMaterial) {
        new MaterialesDetalleDAO().insertarMD(objMaterial);
    }

    @Override
    public void modificarMD(Object objMaterial) {
        new MaterialesDetalleDAO().modificarMD(objMaterial);
    }

    @Override
    public void eliminarMD(Object objMaterial) {
        new MaterialesDetalleDAO().eliminarMD(objMaterial);
    }

    @Override
    public void ModificarGananciasTrabajos(String condicion) {
        new MaterialesDetalleDAO().ModificarGananciasTrabajos(condicion);
    }

    
    
}
