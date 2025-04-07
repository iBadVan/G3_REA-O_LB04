package Actividad4;

public class ModaCalculator {
    public static int moda1(int array[]) {
        int first = 0;
        int end = array.length - 1;

        if (first == end)
            return array[first];

        int moda = array[first];
        int maxfre = frecuencia(array, first, end, moda);

        for (int i = first + 1; i <= end; i++) {
            int frec = frecuencia(array, i, end, array[i]);
            if (frec > maxfre) {
                maxfre = frec;
                moda = array[i];
            }
        }

        return moda;
    }

    
}
