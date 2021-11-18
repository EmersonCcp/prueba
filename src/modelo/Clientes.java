/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class Clientes {
    
    private Integer cli_codigo;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_telefono;
    private String cli_direccion;
    private String cli_ruc;

    public Clientes() {
    }

    public Clientes(Integer cli_codigo) {
        this.cli_codigo = cli_codigo;
    }
    

    public Clientes(Integer cli_codigo, String cli_nombre, String cli_apellido, String cli_telefono, String cli_direccion, String cli_ruc) {
        this.cli_codigo = cli_codigo;
        this.cli_nombre = cli_nombre;
        this.cli_apellido = cli_apellido;
        this.cli_telefono = cli_telefono;
        this.cli_direccion = cli_direccion;
        this.cli_ruc = cli_ruc;
    }

    public Clientes(String cli_nombre, String cli_ruc) {
        this.cli_nombre = cli_nombre;
        this.cli_ruc = cli_ruc;
    }
    

    

    public Integer getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(Integer cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_ruc() {
        return cli_ruc;
    }

    public void setCli_ruc(String cli_ruc) {
        this.cli_ruc = cli_ruc;
    }
    
    
    
    
    
}
