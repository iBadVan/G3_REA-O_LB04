package Actividad4;

public class Pivoteador {
    public static void pivote2(int[] array, int mediana, int prim, int ult, int[] izq, int[] der) {
        int i = prim, j = prim;
        int k = ult;

        while (j <= k) {
            if (array[j] < mediana) {
                swap(array, i++, j++);
            } else if (array[j] > mediana) {
                swap(array, j, k--);
            } else {
                j++;
            }
        }

        izq[0] = i;
        der[0] = j;
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
