
package practicaevaluada1;


public abstract class CuerpoCeleste implements Planeta {
    private String nombre;
    private double tamaño; //km
    private double distanciaAlSol; //millones de Km
    

    public CuerpoCeleste(String nombre, double tamaño, double distanciaAlSol) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.distanciaAlSol = distanciaAlSol;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    
    public abstract double calcularAño();
    
    public abstract String getTipo();

       
}
