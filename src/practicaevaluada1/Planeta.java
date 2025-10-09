
package practicaevaluada1;


public interface Planeta {
    String getNombre();
    double getTamaño(); //Comparación
    double getDistanciaAlSol();//Comparación
    int getNumeroLunas();
    double calcularAño(); //Tiempo que tarda en dar la vuelta al sol en días
    String getTipo(); //Gaseoso o Rocoso
}
