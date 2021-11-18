/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Clientes;

/**
 *
 * @author Gabriel
 */
public class ClientesDAO implements IDAO_Clientes {

    Connection con = null;
    ArrayList<Clientes> lista = new ArrayList<>();
    Clientes clientesObj = null;
    PreparedStatement ps;
    ResultSet rs;
    private String SSQL;

    public ClientesDAO() {
        con = new Conexion().Conectar();
    }

    @Override
    public ArrayList listarClientes(String condicion) {
        try {
            SSQL = "Select * from clientes " + condicion;
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                clientesObj = new Clientes(
                        rs.getInt("cli_codigo"),
                        rs.getString("cli_nombre"),
                        rs.getString("cli_apellido"),
                        rs.getString("cli_telefono"),
                        rs.getString("cli_direccion"),
                        rs.getString("cli_ruc")
                );
                lista.add(clientesObj);

            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en listar " + e);
        }
        return null;
    }

    @Override
    public void insertarCliente(Object objMaterial) {
        try {
            clientesObj=(Clientes) objMaterial;
            String ssql = "INSERT INTO clientes (cli_nombre,cli_ruc,cli_telefono,cli_direccion) VALUES (?,?,?,?,?)";
            ps = con.prepareStatement(ssql);
            ps.setString(1, clientesObj.getCli_nombre());
            ps.setString(2, clientesObj.getCli_apellido());
            ps.setString(3, clientesObj.getCli_ruc());
            ps.setString(4, clientesObj.getCli_telefono());
            ps.setString(5, clientesObj.getCli_direccion());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado con Exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en insertar ade clientes "+ex);
        }
    }

    @Override
    public void modificarCliente(Object objMaterial) {

    }

    @Override
    public void eliminarCliente(Object objMaterial) {

    }

    @Override
    public ArrayList<String> llenarComboClientes() {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            SSQL = "select a.cli_nombre,a.cli_ruc, a.cli_codigo from clientes a order by a.cli_codigo";
            ps = con.prepareStatement(SSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(rs.getInt("cli_codigo") + " - " + rs.getString("cli_nombre") + " - " + rs.getString("cli_ruc"));

            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en listar combobox " + e);
        }
        return lista;

    }

    @Override
    public String Cliente(int i) {
        String a = "select a.cli_nombre from clientes a where a.cli_codigo=" + i;
        String nombre = "";
        try {
            ps = con.prepareStatement(a);

            rs = ps.executeQuery();
            while (rs.next()) {
                nombre = "" + rs.getString("cli_nombre");
            }

            //JOptionPane.showMessageDialog(null, nombre);
            return nombre;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en filtrar el nombre");
        }
        return a;
    }

}
