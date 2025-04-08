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

    private static boolean backtrack(int[] arr, int index, int sumaActual, int objetivo) {
        if (index == arr.length)
            return sumaActual == objetivo;

        int actual = arr[index];

        //potencia de 2
        if (esPotenciaDe2(actual)) {
            return backtrack(arr, index + 1, sumaActual + actual, objetivo);
        }

        //múltiplos de 5 con restricción
        if (actual % 5 == 0 && index + 1 < arr.length && arr[index + 1] % 2 != 0) {
            // No se puede incluir
            return backtrack(arr, index + 1, sumaActual, objetivo);
        }

        //incluir el número actual
        if (backtrack(arr, index + 1, sumaActual + actual, objetivo)) 
            return true;

        // no incluirlo
        if (backtrack(arr, index + 1, sumaActual, objetivo)) 
            return true;

        return false;
    }


}
