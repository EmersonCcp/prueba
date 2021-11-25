
package datos;

import java.util.ArrayList;


public interface IDAO_Trabajos {
     public ArrayList listarTrabajo(String condicionM);
     public ArrayList listarTrabajoReporte(String condicionM);
    public void insertarTrabajo(Object objTrabajo);
    public void modificarTrabajo(Object objTrabajo);
    public void eliminarTrabajo(Object objTrabajo);
    public int FiltrarIdTrabajo(Object id);
    public void FiltrarTrabajo(Object objTrabajo);
    
}
