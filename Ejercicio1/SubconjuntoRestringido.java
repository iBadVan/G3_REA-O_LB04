package Ejercicio1;

public class SubconjuntoRestringido  {
    public static boolean esPotenciaDe2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static boolean puedeFormarObjetivo(int[] arr, int target) {
        int n = arr.length;
        return backtrack(arr, 0, 0, target);
    }

    
}
