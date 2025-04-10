package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 10, 4, 17};
        int k = 3;

        int resultado = QuickSelect.findKthSmallest(arr, k);
        System.out.println("Entrada: [4, 2, 7, 10, 4, 17], " + k);
        System.out.println("El tercer elemento más pequeño en el arreglo es " + resultado + ". Salida: " + resultado);
    }
}
