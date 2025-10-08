
package practicaevaluada1;

//PRUEBA
public class PlanetaRocoso extends Planet {
    
    private String composicion, tipoSuperficie, caractTamaño, tipoNucleo;

    public PlanetaRocoso(String composicion, String tipoSuperficie, String caractTamaño, String tipoNucleo, double tamaño, double distanciaSol, int numLunas) {
        super(tamaño, distanciaSol, numLunas);
        this.composicion = composicion;
        this.tipoSuperficie = tipoSuperficie;
        this.caractTamaño = caractTamaño;
        this.tipoNucleo = tipoNucleo;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public String getCaractTamaño() {
        return caractTamaño;
    }

    public void setCaractTamaño(String caractTamaño) {
        this.caractTamaño = caractTamaño;
    }

    public String getTipoNucleo() {
        return tipoNucleo;
    }

    public void setTipoNucleo(String tipoNucleo) {
        this.tipoNucleo = tipoNucleo;
    }

    

    @Override
    public String toString() {
        return super.toString() + "Planeta Rocoso: " + "\nComposición = " + composicion + 
                "\nTipo de Superficie = " + tipoSuperficie + "Tamaño = " + caractTamaño + 
                "\nTipo de Núcleo=" + tipoNucleo + ".";
    }
    
    
    
    
    
    
     
}
