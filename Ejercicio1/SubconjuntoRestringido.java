package Ejercicio1;

public class SubconjuntoRestringido  {
    public static boolean esPotenciaDe2(int n) {
        if (n <= 0) {
            return false;
        }
    
        while (n % 2 == 0) {
            n = n / 2;
        }
    
        return n == 1;
    }
    

    public static boolean puedeFormarObjetivo(int[] arr, int target) {
        int n = arr.length;
        return backtrack(arr, 0, 0, target);
    }


}
