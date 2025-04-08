package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        int[][] entradas = {
            {5, 4, 8, 10, 3, 5, 27},     
            {5, 4, 8, 10, 3, 6, 27},     
            {6, 2, 16, 5, 7, 10, 33},    
            {6, 2, 16, 5, 3, 10, 33},    
            {4, 2, 5, 1, 6, 13}         
        };

        for (int[] entrada : entradas) {
            boolean resultado = SubconjuntoRestringido.resolverEntrada(entrada);
            System.out.println(resultado);
        }
    }
}
