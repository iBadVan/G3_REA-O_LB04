package Actividad4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SetVectors {
     private PriorityQueue<Limits> elementos;

    public SetVectors() {
        // Ordenamos por longitud descendente (el más largo primero)
        elementos = new PriorityQueue<>(Comparator.comparingInt(Limits::length).reversed());
    }
    public void insertar(Limits l) {
        elementos.offer(l);
    }

    public Limits mayor() {
        return elementos.poll(); // Extrae el mayor
    }
    public int longMayor() {
        Limits mayor = elementos.peek();
        return (mayor != null) ? mayor.length() : 0;
    }

    public boolean esVacio() {
        return elementos.isEmpty();
    }

    public void destruir() {
        elementos.clear();
    }
    
}
