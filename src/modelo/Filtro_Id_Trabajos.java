
package modelo;


public class Filtro_Id_Trabajos {
    private Integer fi_trabajo;
    private Integer fi_codigo;

    public Filtro_Id_Trabajos() {
    }
    
    

    public Filtro_Id_Trabajos(Integer fi_trabajo, Integer fi_codigo) {
        this.fi_trabajo = fi_trabajo;
        this.fi_codigo = fi_codigo;
    }

    public Integer getFi_trabajo() {
        return fi_trabajo;
    }

    public void setFi_trabajo(Integer fi_trabajo) {
        this.fi_trabajo = fi_trabajo;
    }

    public Integer getFi_codigo() {
        return fi_codigo;
    }

    public void setFi_codigo(Integer fi_codigo) {
        this.fi_codigo = fi_codigo;
    }
    
}
