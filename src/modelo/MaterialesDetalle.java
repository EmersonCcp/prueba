
package modelo;


public class MaterialesDetalle {
    private Integer md_codigo;
    private String md_material;
    private Double md_cantidad;
    private Double md_precio;
    private Double md_precio_total;
    private Integer fk_trabajo;

    public MaterialesDetalle() {
    }

    public MaterialesDetalle(Integer md_codigo) {
        this.md_codigo = md_codigo;
    }
    

    public MaterialesDetalle(Integer md_codigo, String md_material, Double md_cantidad, Double md_precio, Double md_precio_total, Integer fk_trabajo) {
        this.md_codigo = md_codigo;
        this.md_material = md_material;
        this.md_cantidad = md_cantidad;
        this.md_precio = md_precio;
        this.md_precio_total = md_precio_total;
        this.fk_trabajo = fk_trabajo;
    }

    public MaterialesDetalle(Integer md_codigo, String md_material, Double md_cantidad, Double md_precio, Double md_precio_total) {
        this.md_codigo = md_codigo;
        this.md_material = md_material;
        this.md_cantidad = md_cantidad;
        this.md_precio = md_precio;
        this.md_precio_total = md_precio_total;
    }
    
    
    

    

    public Integer getMd_codigo() {
        return md_codigo;
    }

    public void setMd_codigo(Integer md_codigo) {
        this.md_codigo = md_codigo;
    }

    public String getMd_material() {
        return md_material;
    }

    public void setMd_material(String md_material) {
        this.md_material = md_material;
    }

    public Double getMd_cantidad() {
        return md_cantidad;
    }

    public void setMd_cantidad(Double md_cantidad) {
        this.md_cantidad = md_cantidad;
    }

    public Double getMd_precio() {
        return md_precio;
    }

    public void setMd_precio(Double md_precio) {
        this.md_precio = md_precio;
    }

    public Double getMd_precio_total() {
        return md_precio_total;
    }

    public void setMd_precio_total(Double md_precio_total) {
        this.md_precio_total = md_precio_total;
    }

    public Integer getFk_trabajo() {
        return fk_trabajo;
    }

    public void setFk_trabajo(Integer fk_trabajo) {
        this.fk_trabajo = fk_trabajo;
    }
    
    
    
    
}
