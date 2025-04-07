package Actividad4;

public class Limits  {
    int prim;
    int ult;
    int[] array;

    public Limits(int[] array, int prim, int ult) {
        this.array = array;
        this.prim = prim;
        this.ult = ult;
    }

    public int length() {
        return ult - prim + 1;
    }
}
