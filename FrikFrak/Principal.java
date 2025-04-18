import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Frik_Frak frikfrak = new Frik_Frak();
        frikfrak.mostrar();
        // frikfrak.mover(null, 0, 0, 0, 0);

        // Loop para permitir que o jogador insira peça no tabuleiro
        for (int y = 0; y < 6; y++) {
            // Exibir o tabuleiro atual

            // Solicitar ao utilizador as coordenadas da linha e da coluna
            System.out.println("Jogue entrando com a linha (0-2) e a coluna (0-2)");
            String a;
            if ((y + 1) % 2 == 0) {
                a = "X";
            } else {
                a = "Y";
            }
            int linha = ler.nextInt();
            int coluna = ler.nextInt();
            linha = linha - 1;
            coluna = coluna - 1;
            // Verificar se a posição é válida
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                // Colocar o valor na célula correspondente
                frikfrak.jogar(a, linha, coluna);
                frikfrak.mostrar();

            } else {
                System.out.println("Posição inválida. Tente novamente.");
                y--; // Decrementar o contador para repetir a iteração
                frikfrak.mostrar();
            }
            if (y > 3) {
                if (frikfrak.venceu() == true) {
                    System.out.println("O jogador " + a + " é o vencedor");
                    break;
                }
            }
        }

        if (frikfrak.venceu() != true) {
            do {
                System.out.println("Mova a sua peça do tabuleiro insirindo a linha ");
                System.out.println("e a coluna atual para uma linha e uma outra coluna pretendida");
                System.out.println("Linha e coluna atual");
                int linhaAtual = ler.nextInt();
                int colunaAtual = ler.nextInt();
                System.out.println("Linha e coluna pretendida");
                int linhaPretendida = ler.nextInt();
                int colunaPretendida = ler.nextInt();
                // frikfrak.mover
                frikfrak.mover(linhaAtual, colunaAtual, linhaPretendida, colunaPretendida);
                frikfrak.mostrar();

            } while (frikfrak.venceu() != true);
            System.out.println("Você é o vencedor ");
            frikfrak.mostrar();
        }

    }
}
