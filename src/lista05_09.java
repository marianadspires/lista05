//Faça um algoritmo que leia uma matriz 3x3 e após a leitura multiplique os
//elementos da diagonal principal com a média dos elementos da diagonal secundária.
import java.util.Scanner;

public class lista05_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        double mediaDiagonalSecundaria;
        int somaDiagonalSecundaria = 0;


        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        mediaDiagonalSecundaria = somaDiagonalSecundaria / 3.0;


        System.out.println("\nMatriz após multiplicar a diagonal principal pela média da diagonal secundária:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matriz[i][j] *= mediaDiagonalSecundaria;
                }
                System.out.printf("%8.2f", (double) matriz[i][j]);
            }
            System.out.println();
        }

    }
}


