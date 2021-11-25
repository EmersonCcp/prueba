
package modelo;

public class FiltroTrabajos {
    private Integer fil_codigo;
    private String  fil_inicio;
    private String fil_final;
    private Double costo_total;
    private Double ganancias_total;

    public FiltroTrabajos() {
    }

    public FiltroTrabajos(Integer fil_codigo, String fil_inicio, String fil_final) {
        this.fil_codigo = fil_codigo;
        this.fil_inicio = fil_inicio;
        this.fil_final = fil_final;
    }

    
    public FiltroTrabajos(Integer fil_codigo, String fil_inicio, String fil_final, Double costo_total, Double ganancias_total) {
        this.fil_codigo = fil_codigo;
        this.fil_inicio = fil_inicio;
        this.fil_final = fil_final;
        this.costo_total = costo_total;
        this.ganancias_total = ganancias_total;
    }

    public Integer getFil_codigo() {
        return fil_codigo;
    }

    public void setFil_codigo(Integer fil_codigo) {
        this.fil_codigo = fil_codigo;
    }

    public String getFil_inicio() {
        return fil_inicio;
    }

    public void setFil_inicio(String fil_inicio) {
        this.fil_inicio = fil_inicio;
    }

    public String getFil_final() {
        return fil_final;
    }

    public void setFil_final(String fil_final) {
        this.fil_final = fil_final;
    }

    public Double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Double costo_total) {
        this.costo_total = costo_total;
    }

    public Double getGanancias_total() {
        return ganancias_total;
    }

    public void setGanancias_total(Double ganancias_total) {
        this.ganancias_total = ganancias_total;
    }
    
    
}
