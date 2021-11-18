
package modelo;


public class TrabajosMateriales {
    private Integer fk_trabajo;
    private Integer fk_material;

    public TrabajosMateriales() {
    }

    public TrabajosMateriales(Integer fk_trabajo, Integer fk_material) {
        this.fk_trabajo = fk_trabajo;
        this.fk_material = fk_material;
    }

    public Integer getFk_trabajo() {
        return fk_trabajo;
    }

    public void setFk_trabajo(Integer fk_trabajo) {
        this.fk_trabajo = fk_trabajo;
    }

    public Integer getFk_material() {
        return fk_material;
    }

    public void setFk_material(Integer fk_material) {
        this.fk_material = fk_material;
    }
    

    
    
    
}
