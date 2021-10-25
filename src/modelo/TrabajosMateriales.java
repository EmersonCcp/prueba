
package modelo;


public class TrabajosMateriales {
    private Integer tm_codigo;
    private String tm_material;
    private Integer tm_cantidad;
    private Integer tm_precio;
    private Integer tm_precio_total;

    public TrabajosMateriales() {
    }

    public TrabajosMateriales(Integer tm_codigo, String tm_material, Integer tm_cantidad, Integer tm_precio, Integer tm_precio_total) {
        this.tm_codigo = tm_codigo;
        this.tm_material = tm_material;
        this.tm_cantidad = tm_cantidad;
        this.tm_precio = tm_precio;
        this.tm_precio_total = tm_precio_total;
    }

    public Integer getTm_codigo() {
        return tm_codigo;
    }

    public void setTm_codigo(Integer tm_codigo) {
        this.tm_codigo = tm_codigo;
    }

    public String getTm_material() {
        return tm_material;
    }

    public void setTm_material(String tm_material) {
        this.tm_material = tm_material;
    }

    public Integer getTm_cantidad() {
        return tm_cantidad;
    }

    public void setTm_cantidad(Integer tm_cantidad) {
        this.tm_cantidad = tm_cantidad;
    }

    public Integer getTm_precio() {
        return tm_precio;
    }

    public void setTm_precio(Integer tm_precio) {
        this.tm_precio = tm_precio;
    }

    public Integer getTm_precio_total() {
        return tm_precio_total;
    }

    public void setTm_precio_total(Integer tm_precio_total) {
        this.tm_precio_total = tm_precio_total;
    }
    
    
    
}
