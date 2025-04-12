package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        

        int[] entrada = {5, 2, 4, 8, 10, 3, 14};
        boolean resultado = SubconjuntoRestringido.resolverEntrada(entrada);
        
        if (resultado) {
            System.out.println("Sí es posible formar el objetivo respetando las restricciones.");
            System.out.println(resultado);
        } else {
            System.out.println("No es posible formar el objetivo con esas restricciones.");
            System.out.println(resultado);
        }

        int[] entrada2 = {5, 4, 8, 10, 3, 5, 27};
        boolean resultado2 = SubconjuntoRestringido.resolverEntrada(entrada2);

        if (resultado2) {
            System.out.println("Sí es posible formar el objetivo respetando las restricciones.");
            System.out.println(resultado2);
        } else {
            System.out.println("No es posible formar el objetivo con esas restricciones.");
            System.out.println(resultado2);
        }

    }
}
