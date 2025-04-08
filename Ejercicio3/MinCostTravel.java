package Ejercicio3;

import java.util.Scanner;

public class MinCostTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de embarcaderos (n): ");
        int n = sc.nextInt();
        
        int[][] T = new int[n][n];

        System.out.println("Ingrese la matriz de tarifas T:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                T[i][j] = sc.nextInt();
            }
        }
        
        // Usamos un valor suficientemente grande para representar "infinito"
        int INF = 1000000;
        
        int[][] C = new int[n][n];
        
        // Inicialización de la matriz C para los casos donde i == j
        for (int i = 0; i < n; i++) {
            C[i][i] = 0; // El coste de ir de un embarcadero a el mismo es 0
        }
        
        // Inicializar la matriz C con el valor de "infinito" donde no hay un camino directo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && T[i][j] == 0) {
                    C[i][j] = INF; // Representamos con "infinito" donde no hay ruta directa
                } else if (i != j) {
                    C[i][j] = T[i][j]; // Asignamos el coste directo donde existe una tarifa
                }
            }
        }

        // Programación dinámica para calcular los costes mínimos
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Si hay un camino de i a k y de k a j, actualizamos el coste de i a j
                    if (C[i][k] != INF && C[k][j] != INF) {
                        C[i][j] = Math.min(C[i][j], C[i][k] + C[k][j]);
                    }
                }
            }
        }

        // Imprimir la matriz C (costes mínimos)
        System.out.println("Matriz de costes mínimos C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (C[i][j] == INF) {
                    System.out.print("INF "); // Usamos "INF" para representar los valores no calculados
                } else {
                    System.out.print(C[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Coste mínimo entre el primer y el último embarcadero
        System.out.println("El coste mínimo para viajar de 0 a " + (n-1) + " es: " + C[0][n-1]);
        
        sc.close();
    }
}
