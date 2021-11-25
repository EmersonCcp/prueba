
package modelo;




public class Trabajos {
    private Integer tra_codigo;
    private String tra_nombre;
    private String tra_fecha_entrega;
    private String tra_descripcion;
    private Double tra_costo;
    private Double tra_ganancia;
    private Integer fk_cliente;
    private String tra_cliente;
    

    public Trabajos() {
    }

    public Trabajos(Integer tra_codigo) {
        this.tra_codigo = tra_codigo;
    }

    public Trabajos(Integer tra_codigo, String tra_nombre, String tra_fecha_entrega, String tra_descripcion, Double tra_costo, Double tra_ganancia, String tra_cliente) {
        this.tra_codigo = tra_codigo;
        this.tra_nombre = tra_nombre;
        this.tra_fecha_entrega = tra_fecha_entrega;
        this.tra_descripcion = tra_descripcion;
        this.tra_costo = tra_costo;
        this.tra_ganancia = tra_ganancia;
        this.tra_cliente = tra_cliente;
    }

   

    
    

    public Trabajos(Integer tra_codigo, String tra_nombre, String tra_fecha_entrega, String tra_descripcion, Double tra_costo, Integer fk_cliente) {
        this.tra_codigo = tra_codigo;
        this.tra_nombre = tra_nombre;
        this.tra_fecha_entrega = tra_fecha_entrega;
        this.tra_descripcion = tra_descripcion;
        this.tra_costo = tra_costo;
        this.fk_cliente = fk_cliente;
    }
    

    public Trabajos(Integer tra_codigo, String tra_nombre, String tra_fecha_entrega, String tra_descripcion, Double tra_costo, Double tra_ganancia, Integer fk_cliente) {
        this.tra_codigo = tra_codigo;
        this.tra_nombre = tra_nombre;
        this.tra_fecha_entrega = tra_fecha_entrega;
        this.tra_descripcion = tra_descripcion;
        this.tra_costo = tra_costo;
        this.tra_ganancia = tra_ganancia;
        this.fk_cliente = fk_cliente;
    }

    public Integer getTra_codigo() {
        return tra_codigo;
    }

    public void setTra_codigo(Integer tra_codigo) {
        this.tra_codigo = tra_codigo;
    }

    public String getTra_nombre() {
        return tra_nombre;
    }

    public void setTra_nombre(String tra_nombre) {
        this.tra_nombre = tra_nombre;
    }

    public String getTra_fecha_entrega() {
        return tra_fecha_entrega;
    }

    public void setTra_fecha_entrega(String tra_fecha_entrega) {
        this.tra_fecha_entrega = tra_fecha_entrega;
    }

    public String getTra_descripcion() {
        return tra_descripcion;
    }

    public void setTra_descripcion(String tra_descripcion) {
        this.tra_descripcion = tra_descripcion;
    }

    public Double getTra_costo() {
        return tra_costo;
    }

    public void setTra_costo(Double tra_costo) {
        this.tra_costo = tra_costo;
    }

    public Double getTra_ganancia() {
        return tra_ganancia;
    }

    public void setTra_ganancia(Double tra_ganancia) {
        this.tra_ganancia = tra_ganancia;
    }

    public Integer getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(Integer fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public String getTra_cliente() {
        return tra_cliente;
    }

    public void setTra_cliente(String tra_cliente) {
        this.tra_cliente = tra_cliente;
    }

    

    
    
    
    
}
