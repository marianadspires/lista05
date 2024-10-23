//Faça um algoritmo que gere randomicamente uma matriz de 5 X 5 de inteiros
//positivos e mostre a soma de cada coluna separadamente.
import java.util.Random;

public class lista05_03 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] somaColunas = new int[5];
        Random random = new Random();

        System.out.println("Matriz 5x5:");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                System.out.printf("%4d", matriz[i][j]);

                somaColunas[j] += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.printf("Coluna %d: %d\n", j + 1, somaColunas[j]);
        }
    }
}


