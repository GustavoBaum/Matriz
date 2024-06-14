

import java.util.Scanner;
public class Matriz {

    public Matriz() {
        int[][] numeros = new int[3][3];

        numeros[0][0] = 5;
        
        //Popular valores:
        Scanner entrada = new Scanner(System.in);
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.print("Numero[" + linha + "][" + coluna + "]: ");
                numeros[linha][coluna] = entrada.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++ ) { //linhas
            for (int j = 0; j < numeros[0].length; j++) { //colunas
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
        entrada.close();
        
    }

    public static void main(String[] args) {
        new Matriz();
    }
}
