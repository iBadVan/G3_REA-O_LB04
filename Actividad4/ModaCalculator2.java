package Actividad4;

public class ModaCalculator2 {
    public static int moda2(int[] array) {
        int first = 1;
        int p = 0;
        int end = array.length - 1;
        int moda = array[0];
        int frec = 1;
        int maxfre = 0;
    
        while (first <= end) {
            if (array[p] == array[first]) {
                frec++;
                first++;
            } else {
                if (frec > maxfre) {
                    maxfre = frec;
                    moda = array[p];
                }
                p = first;
                first = p + 1;
                frec = 1;
            }
        }

        return moda;
    
    }
}
