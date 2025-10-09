
package practicaevaluada1;


public abstract class CuerpoCeleste implements Planeta {
     private String nombre;
    private double tamaño; //km
    private double distanciaAlSol; //millones de Km
    private int numeroLunas; 

    public CuerpoCeleste(String nombre, double tamaño, double distanciaAlSol, int numeroLunas) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.distanciaAlSol = distanciaAlSol;
        this.numeroLunas = numeroLunas;
    }
    
   

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    @Override
    public int getNumeroLunas() {
        return numeroLunas;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }

    @Override
    public abstract double calcularAño();
    
    @Override
    public abstract String getTipo();

       
}
