package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        

        int[] entrada = {6, 1, 2, 5, 3, 4, 6, 12};
        boolean resultado = SubconjuntoRestringido.resolverEntrada(entrada);
        
        if (resultado) {
            System.out.println("Sí es posible formar el objetivo respetando las restricciones.");
        } else {
            System.out.println("No es posible formar el objetivo con esas restricciones.");
        }
    }
}
