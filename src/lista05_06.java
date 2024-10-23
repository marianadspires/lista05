//Elaborar um algoritmo que leia uma matriz M[6][6] e um valor A, e que após
//a leitura multiplique a matriz M pelo valor A e coloque os valores da matriz multiplicados por
//A em um vetor V(36). Escrever o vetor V no final.

import java.util.Scanner;

public class lista05_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] M = new int[6][6];
        int[] V = new int[36];
        int A;

        System.out.println("Digite os elementos da matriz M (6x6):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                M[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o valor A: ");
        A = scanner.nextInt();


        int index = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                V[index] = M[i][j] * A;
                index++;
            }
        }

        System.out.println("\nVetor V (valores da matriz M multiplicados por A):");
        for (int i = 0; i < V.length; i++) {
            System.out.printf("%4d", V[i]);
        }

    }
}


