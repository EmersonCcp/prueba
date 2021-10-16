
package modelo;


public class Materiales {
    private Integer ma_codigo;
    private String ma_nombre;
    private Double ma_cantidad;
    private Double precio;
    private String ma_fecha_compra;
    private String ma_factura;
    private Integer ma_categoria;
    private Double ma_precio_total;

    public Materiales() {
    }

    public Materiales(Integer ma_codigo) {
        this.ma_codigo = ma_codigo;
    }

    public Materiales(Integer ma_codigo, String ma_nombre, Double ma_cantidad, Double precio, String ma_fecha_compra, String ma_factura, Integer ma_categoria, Double ma_precio_total) {
        this.ma_codigo = ma_codigo;
        this.ma_nombre = ma_nombre;
        this.ma_cantidad = ma_cantidad;
        this.precio = precio;
        this.ma_fecha_compra = ma_fecha_compra;
        this.ma_factura = ma_factura;
        this.ma_categoria = ma_categoria;
        this.ma_precio_total = ma_precio_total;
    }

    public Integer getMa_codigo() {
        return ma_codigo;
    }

    public void setMa_codigo(Integer ma_codigo) {
        this.ma_codigo = ma_codigo;
    }

    public String getMa_nombre() {
        return ma_nombre;
    }

    public void setMa_nombre(String ma_nombre) {
        this.ma_nombre = ma_nombre;
    }

    public Double getMa_cantidad() {
        return ma_cantidad;
    }

    public void setMa_cantidad(Double ma_cantidad) {
        this.ma_cantidad = ma_cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMa_fecha_compra() {
        return ma_fecha_compra;
    }

    public void setMa_fecha_compra(String ma_fecha_compra) {
        this.ma_fecha_compra = ma_fecha_compra;
    }

    public String getMa_factura() {
        return ma_factura;
    }

    public void setMa_factura(String ma_factura) {
        this.ma_factura = ma_factura;
    }

    public Integer getMa_categoria() {
        return ma_categoria;
    }

    public void setMa_categoria(Integer ma_categoria) {
        this.ma_categoria = ma_categoria;
    }

    public Double getMa_precio_total() {
        return ma_precio_total;
    }

    public void setMa_precio_total(Double ma_precio_total) {
        this.ma_precio_total = ma_precio_total;
    }
    
    

    
}
