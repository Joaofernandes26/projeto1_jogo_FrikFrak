public class Frik_Frak {

    private String[][] tab;

    public Frik_Frak() {
        tab = new String[3][3]; // Matris- Tabuleiro
        inicializar();

    }

    public void inicializar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = " ";
            }
        }
    }

    public void jogar(String peca, int linha, int coluna) {
        tab[linha][coluna] = peca;
    }

    public void mover(int linhaOrigen, int colunaOrigen, int linhaDestino, int colunaDestino) {
        String g = tab[linhaOrigen][colunaOrigen];
        tab[linhaDestino][colunaDestino] = g;
        tab[linhaOrigen][colunaOrigen] = " ";
    }

    /*
     * public void mover(String peca, int linhaOrigen, int colunaOrigen, int
     * linhaDestino, int colunaDestino) {
     * tab[linhaOrigen][colunaOrigen] = " ";
     * tab[linhaDestino][colunaDestino] = peca;
     * }
     */

    public boolean venceu() {

        if ((tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2]) || // linha
                (tab[1][0] == tab[1][1] && tab[1][1] == tab[0][2]) || // linha
                (tab[2][0] == tab[2][1] && tab[2][1] == tab[0][2]) || // linha
                (tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0]) || // coluno
                (tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1]) || // coluno
                (tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2]) || // coluno
                (tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2]) || // diagonal
                (tab[2][0] == tab[1][1] && tab[1][1] == tab[0][2]))// diagonal
            return true;// diagonais
        else

            return false;

    }

    public void mostrar() {
        System.out.println("\n");
        System.out.println("+-----+-----+-----+");
        System.out.println("|  " + tab[0][0] + "  |  " + tab[0][1] + "  |  " + tab[0][2] + "  |");
        System.out.println("+-----+-----+-----+");
        System.out.println("|  " + tab[1][0] + "  |  " + tab[1][1] + "  |  " + tab[1][2] + "  |");
        System.out.println("+-----+-----+-----+");
        System.out.println("|  " + tab[2][0] + "  |  " + tab[2][1] + "  |  " + tab[2][2] + "  |");
        System.out.println("+-----+-----+-----+\n");

    }

}
