//Faça um algoritmo que calcule a média dos elementos da diagonal principal
//de uma matriz 10X10 de inteiros.
import java.util.Scanner;

public class lista05_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int somaDiagonalPrincipal = 0;

        System.out.println("Digite os elementos da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }


        double media = somaDiagonalPrincipal / 10.0;


        System.out.printf("\nMédia dos elementos da diagonal principal: %.2f\n", media);

    }
}


