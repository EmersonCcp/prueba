
package modelo;


public class Usuarios {
    private Integer codigo;
    private String usuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String contraseña;
    private String telefono;
    

    public Usuarios() {
    }

    public Usuarios(Integer codigo) {
        this.codigo = codigo;
    }
    

    public Usuarios(Integer codigo, String usuario, String nombre, String apellido, String direccion, String contraseña, String telefono) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    
    
}
