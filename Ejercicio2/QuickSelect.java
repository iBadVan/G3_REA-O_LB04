package Ejercicio2;

public class QuickSelect {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Elegimos el pivote como el último elemento
        int i = low - 1; // Índice para el menor elemento

        // Reorganizamos el arreglo comparando cada elemento con el pivote
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Intercambiamos arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //  pivote en su posición final
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // eetorna el índice del pivote
    }
    
    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);

            // Si el pivote es el k-ésimo elemento
            if (pivotIndex == k) {
                return arr[pivotIndex];
            }
            // Si el pivote está en una posición mayor que k, buscamos en el subarreglo izquierdo
            else if (pivotIndex > k) {
                return quickSelect(arr, low, pivotIndex - 1, k);
            }
            // Si el pivote está en una posición menor que k, buscamos en el subarreglo derecho
            else {
                return quickSelect(arr, pivotIndex + 1, high, k);
            }
        }
        return -1; // En caso de error
    }


}
