
package practicaevaluada1;


/*
 @author Grupo8
 */

public class Principal {

    public static void main(String[] args) {
        
        CuerpoCeleste[] planetas = new CuerpoCeleste[5]; 
        planetas [0] = new PlanetaRocoso("Mercurio", 4880, 57.9, 0, "Silicatos y metales", "Sólida y bien definida", "Pequeño y menos masivo", "Metálico y sólido");
        planetas [1] = new PlanetaRocoso("Venus", 108000000, 12104, 0, "Silicatos y metales", "Sólida y bien definida", "Pequeño y menos masivo", "Metálico y sólido");
        planetas [2] = new PlanetaGaseoso("Júpiter", 142984, 778000000, 92, 
            "Gases ligeros", "Inexistente o indefinida", "Grandes y masivos", "Rocoso y metálico");
        planetas [3] = new PlanetaGaseoso("Saturno", 142984, 1429000000, 274, 
            "Gases ligeros", "Inexistente o indefinida", "Grandes y masivos", "Rocoso y metálico");                
                
    }
    
}
