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
    public static int encontrarModa(int[] arreglo) {
        int inicio = 0;
        int fin = arreglo.length - 1;
    
        if (inicio == fin) {
            return arreglo[inicio];
        }
    
        int moda = arreglo[inicio];
        int frecuenciaMaxima = mcontarFrecuencia(arreglo, inicio, fin, moda);
    
        for (int i = inicio + 1; i <= fin; i++) {
            int frecuenciaActual = mcontarFrecuencia(arreglo, i, fin, arreglo[i]);
    
            if (frecuenciaActual > frecuenciaMaxima) {
                frecuenciaMaxima = frecuenciaActual;
                moda = arreglo[i];
            }
        }
    
        return moda;
    }
    
    
}
