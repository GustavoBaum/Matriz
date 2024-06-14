import java.util.Random;
import java.util.Scanner;
public class Trabalho {
    public Trabalho() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        boolean valor = random.nextBoolean();
        
        //Inicializador do tabuleiro:

        char[][] numeros = new char[8][8];

        //Popular Vetores:

        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
            numeros[linha][coluna] = '~';
        }    
    }
        for (int i = 0; i < numeros.length; i++) { //Linhas
            for (int j = 0; j < numeros[0].length; j++) { //Colunas
                System.out.print(numeros[i][j] + " ");
        }
        System.out.println("");
    }
        //Posicionamento dos navios:

        for (int n = 0; n < 10; n++) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            numeros[linha][coluna] = 'N';
        }
        System.out.println("Navios posicionados");

        //Interação com o usuário: 
        int linha = 0;
        int coluna = 0;
        int tentativas = 0;
        do {
            for (int i = 0; i < numeros.length; i++) { //Linhas
                for (int j = 0; j < numeros[0].length; j++) { //Colunas
                    System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
            System.out.println("Indique a posição que deseja atacar: ");
            System.out.print("Linha: ");
            linha = entrada.nextInt();
            System.out.print("Coluna: ");
            coluna = entrada.nextInt();
        } while (tentativas != 30);

        char[][] seleçao = new char[8][8];
        for (int i = 0; i < seleçao.length; i++) {
            if (seleçao[linha][coluna] == 'N') {
                System.out.println("Navio atingido");
                valor = true;
                seleçao[linha][coluna] = 'X';
                tentativas += 1;
                System.out.println("Quantidade de tentativas: " + tentativas);
            } else {
                System.out.println("Nenhum navio atingido");
                valor = false;
                seleçao[linha][coluna] = 'O';
                tentativas += 1;
                System.out.println("Quantidade de tentativas: " + tentativas);
            }
        }
        entrada.close();    
}
    public static void main(String[] args) {
        new Trabalho();
    }
}