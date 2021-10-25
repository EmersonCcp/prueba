/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.ClientesDAO;
import datos.IDAO_Clientes;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Gabriel
 */
public class ClientesControl implements IDAO_Clientes{

    @Override
    public ArrayList listarClientes(String condicion) {
        return new ClientesDAO().listarClientes(condicion);
    }

    @Override
    public void insertarCliente(Object objMaterial) {
        new ClientesDAO().insertarCliente(objMaterial);
    }

    @Override
    public void modificarCliente(Object objMaterial) {
        new ClientesDAO().modificarCliente(objMaterial);
    }

    @Override
    public void eliminarCliente(Object objMaterial) {
        new ClientesDAO().eliminarCliente(objMaterial);
    }

    @Override
    public void listarClientesComboBox(JComboBox cbxClientes) {
         new ClientesDAO().listarClientesComboBox(cbxClientes);
    }

    @Override
    public String Cliente(int i) {
        return new ClientesDAO().Cliente(i);
    }

    
    
    
    
}
