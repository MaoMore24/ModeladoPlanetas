
package practicaevaluada1;


public class Planet {
    private String nombre;
    private double tamaño, distanciaSol;
    private int numLunas;

    public Planet(double tamaño, double distanciaSol, int numLunas) {
        this.tamaño = tamaño;
        this.distanciaSol = distanciaSol;
        this.numLunas = numLunas;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getNumLunas() {
        return numLunas;
    }

    public void setNumLunas(int numLunas) {
        this.numLunas = numLunas;
    }

    @Override
    public String toString() {
        return "Planeta = " + "\nTamaño = " + tamaño 
                + "\nDistancia al Sol = " + distanciaSol 
                + "\nNúmero de Lunas = " + numLunas + ".";
    }
    
    
    
      
    
}
