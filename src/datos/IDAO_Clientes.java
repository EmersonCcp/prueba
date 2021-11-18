/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Gabriel
 */
public interface IDAO_Clientes {
    
    public ArrayList listarClientes(String condicion);
    public void insertarCliente(Object objMaterial);
    public void modificarCliente(Object objMaterial);
    public void eliminarCliente(Object objMaterial);
    public ArrayList <String> llenarComboClientes();
    public String Cliente(int i);
}
