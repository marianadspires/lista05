//Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C que
//contenha em cada posição a quantidade de elementos negativos da linha correspondente de
//M. Tamanho de C igual ao número de linhas da matriz.
import java.util.Random;

public class lista05_02 {
    public static void main(String[] args) {
        int[][] M = new int[6][8];
        int[] C = new int[6];
        Random random = new Random();
        System.out.println("Matriz M[6][8]:");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                M[i][j] = random.nextInt(101) - 50;
                System.out.printf("%4d", M[i][j]);

                if (M[i][j] < 0) {
                    C[i]++;
                }
            }
            System.out.println();  // Pula para a próxima linha
        }

        System.out.println("\nVetor C (contagem de negativos por linha):");
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Linha %d: %d negativos\n", i + 1, C[i]);
        }
    }
}
