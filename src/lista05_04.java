//Faça um algoritmo que gere randomicamente uma matriz de 10 X 10 de
//inteiros. Calcule e mostre a soma das linhas pares da matriz.

import java.util.Random;

public class lista05_04 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();
        int somaLinhasPares = 0;

        System.out.println("Matriz 10x10:");


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.printf("%4d", matriz[i][j]);

                if (i % 2 == 0) {
                    somaLinhasPares += matriz[i][j];
                }
            }
            System.out.println();
        }


        System.out.println("\nSoma dos elementos das linhas pares: " + somaLinhasPares);
    }
}



