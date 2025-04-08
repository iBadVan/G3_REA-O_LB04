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
        
        

    }
}
