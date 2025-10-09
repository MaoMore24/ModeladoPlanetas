
package practicaevaluada1;


public abstract class Planet extends CuerpoCeleste implements Planeta {
    private int numeroLunas;

    public Planet(String nombre, double tamaño, double distanciaAlSol, int numeroLunas) {
        super(nombre, tamaño, distanciaAlSol);
        this.numeroLunas = numeroLunas;
    }

    public int getNumeroLunas() {
        return numeroLunas;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }
    

    public double calcularAño() {
        return this.getDistanciaAlSol() * 365;
    }

    @Override
    public String toString() {
        return "Planeta = " + "\nNúmero de Lunas = " + numeroLunas + ".";
    }
    
          
}
