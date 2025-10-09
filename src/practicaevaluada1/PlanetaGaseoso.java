
package practicaevaluada1;


public class PlanetaGaseoso extends Planet {
        
    private String composicion, tipoSuperficie, caractTamaño, tipoNucleo;

    public PlanetaGaseoso(String nombre, double tamaño, double distanciaAlSol, int numeroLunas, 
            String composicion, String tipoSuperficie, String caractTamaño, String tipoNucleo) {
        super(nombre, tamaño, distanciaAlSol, numeroLunas);
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

    public String getTipo(){
        return "Gaseoso";
    }    
    
    public double calcularAño() {
        return super.calcularAño() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + "Planeta Gaseoso: " + "\nComposición = " + composicion + 
                "\nTipo de Superficie = " + tipoSuperficie + "Tamaño = " + caractTamaño + 
                "\nTipo de Núcleo=" + tipoNucleo + ".";
    }
    
    
    
    
    
     
}
