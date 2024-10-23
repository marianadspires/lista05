//Dadas duas matrizes A 5x5 e B 5x5 inicializadas pelo usuário via teclado, criar
//e imprimir a matriz S sendo a soma de A e B.

import java.util.Scanner;

public class lista05_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] S = new int[5][5];


        System.out.println("Digite os elementos da matriz A (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da matriz B (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nMatriz S (soma de A e B):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                S[i][j] = A[i][j] + B[i][j];
                System.out.printf("%4d", S[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}


