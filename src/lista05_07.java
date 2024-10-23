//Escreva um algoritmo que leia uma matriz M[5][5] e que calcule e imprima
//as somas:
//a) da linha 4 de M.
//b) da coluna 2 de M.
//c) da diagonal principal (une o canto superior esquerdo ao canto inferior direito da
//matriz quadrada).
//d) todos os elementos da matriz M.
//Escrever também a matriz.
import java.util.Scanner;

public class lista05_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M = new int[5][5];  // Matriz 5x5
        int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaTodosElementos = 0;


        System.out.println("Digite os elementos da matriz M (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                M[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {

            somaLinha4 += M[3][i];


            somaColuna2 += M[i][1];


            somaDiagonalPrincipal += M[i][i];


            for (int j = 0; j < 5; j++) {
                somaTodosElementos += M[i][j];
            }
        }

        System.out.println("\nMatriz M (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", M[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nSomas calculadas:");
        System.out.println("a) Soma da linha 4: " + somaLinha4);
        System.out.println("b) Soma da coluna 2: " + somaColuna2);
        System.out.println("c) Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("d) Soma de todos os elementos: " + somaTodosElementos);

    }
}

