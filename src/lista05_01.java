//Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
//imprima a matriz e calcule e imprima a soma dos seus elementos.

public class lista05_01 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][9];
        int soma = 0;

        System.out.println("Matriz 7x9:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d ", matriz[i][j]);
                soma += matriz[i][j];
            }
            System.out.println();
        }


        System.out.println("\nSoma dos numeros da matriz: " + soma);
    }

}
