package proyectoTallerProgramacion.v5;

public class mostrarTablero {
    public static final int nFilas = 11;
    public static final int nColumnas = 11;
    public static final char sCubierto = '▀';
    private static final String saltoLinea = "\n";
    public char[][] tablero;
    public static boolean[][] minas;
    public static boolean[][] descubiertas;
    private StringBuilder tableroPrint = new StringBuilder("");

    public StringBuilder inicializarTablero() {
        tablero = new char[nFilas][nColumnas];
        minas = new boolean[nFilas][nColumnas];
        descubiertas = new boolean[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                tablero[i][j] = sCubierto;
            }
            for (i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tablero[i][j] = sCubierto;
                }
            }
            for (i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tableroPrint.append("| ").append(tablero[i][j]).append(" ");
                }
                tableroPrint.append("|").append(saltoLinea);
            }
        }
        return tableroPrint;
    }
    public char [][] getTablero(){
        return tablero;
    }
}
