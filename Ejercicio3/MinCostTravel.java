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
        
        int[][] C = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            C[i][i] = 0; // El coste de ir de un embarcadero a ell mismo es 0
        }
        
        //  dinámica para calcular los costes minimos
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                C[i][j] = Integer.MAX_VALUE; // Inicializamos el coste con un valor grande
                
                for (int k = i; k < j; k++) {
                    // Calcular el coste mínimo
                    int cost = T[i][k] + C[k][j];
                    if (cost < C[i][j]) {
                        C[i][j] = cost;
                    }
                }
            }
        }

    }
}
