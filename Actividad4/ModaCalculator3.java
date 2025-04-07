package Actividad4;

public class ModaCalculator3 {
    public static int moda3(int[] a, int prim, int ult) {
        SetVectors homogeneo = new SetVectors();
        SetVectors heterogeneo = new SetVectors();

        Limits p = new Limits(a, prim, ult);
        heterogeneo.insertar(p);

        while (heterogeneo.longMayor() > homogeneo.longMayor()) {
            p = heterogeneo.mayor();
            int mediana = p.array[(p.prim + p.ult) / 2];

            int[] izq = new int[1];
            int[] der = new int[1];
            Pivoteador.pivote2(p.array, mediana, p.prim, p.ult, izq, der);

            Limits p1 = new Limits(p.array, p.prim, izq[0] - 1);
            Limits p2 = new Limits(p.array, izq[0], der[0] - 1);
            Limits p3 = new Limits(p.array, der[0], p.ult);

            if (p1.prim <= p1.ult)
                heterogeneo.insertar(p1);
            if (p3.prim <= p3.ult)
                heterogeneo.insertar(p3);
            if (p2.prim <= p2.ult)
                homogeneo.insertar(p2);
        }

        if (homogeneo.esVacio()) {  
            return a[prim];
        }

        Limits result = homogeneo.mayor();
        homogeneo.destruir();
        heterogeneo.destruir();

        return result.array[result.prim];
    }
}
