/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public interface IDAO_TM {
    public ArrayList listarTrabajo(String condicionM);
    public void insertarTrabajo(Object objTrabajo);
    public void modificarTrabajo(Object objTrabajo);
    public void eliminarTrabajo(Object objTrabajo);
    
    
}
