
package modelo;
public class FiltroMateriales {
    private Integer idFiltro;
    private String ma_fecha_inicio;
    private String ma_fecha_final;
    private double precio_total_final;

    public FiltroMateriales() {
    }
    public FiltroMateriales(Integer idFiltro, String ma_fecha_inicio, String ma_fecha_final, double precio_total_final) {
        this.idFiltro = idFiltro;
        this.ma_fecha_inicio = ma_fecha_inicio;
        this.ma_fecha_final = ma_fecha_final;
        this.precio_total_final = precio_total_final;
    }
    public FiltroMateriales(Integer idFiltro, String ma_fecha_inicio, String ma_fecha_final) {
        this.idFiltro = idFiltro;
        this.ma_fecha_inicio = ma_fecha_inicio;
        this.ma_fecha_final = ma_fecha_final;
    }
    public Integer getIdFiltro() {
        return idFiltro;
    }
    public void setIdFiltro(Integer idFiltro) {
        this.idFiltro = idFiltro;
    }
    public String getMa_fecha_inicio() {
        return ma_fecha_inicio;
    }
    public void setMa_fecha_inicio(String ma_fecha_inicio) {
        this.ma_fecha_inicio = ma_fecha_inicio;
    }
    public String getMa_fecha_final() {
        return ma_fecha_final;
    }
    public void setMa_fecha_final(String ma_fecha_final) {
        this.ma_fecha_final = ma_fecha_final;
    }
    public double getPrecio_total_final() {
        return precio_total_final;
    }
    public void setPrecio_total_final(double precio_total_final) {
        this.precio_total_final = precio_total_final;
    }
    
    

    
    
}
