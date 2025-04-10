package Ejercicio1;

public class SubconjuntoRestringido  {
    public static boolean esPotenciaDe2(int n) {
        if (n <= 0) {
            return false;
        }
    
        int original = n; // para debug
        while (n % 2 == 0) {
            n = n / 2;
        }
    
        boolean resultado = (n == 1);
        if (resultado) {
            System.out.println(original + " es potencia de 2");
        }
        return resultado;
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

    public static boolean resolverEntrada(int[] entrada) {
        int n = entrada[0];
        int[] datos = new int[n];
        System.arraycopy(entrada, 1, datos, 0, n);
        int objetivo = entrada[entrada.length - 1];
        return puedeFormarObjetivo(datos, objetivo);
    }

}
