package Actividad4;

public class contarFrecuencia{
    private static int mcontarFrecuencia(int[] arreglo, int inicio, int fin, int elemento) {
        if (inicio > fin) return 0;
    
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (arreglo[i] == elemento) {
                contador++;
            }
        }
    
        return contador;
    }
    
}
