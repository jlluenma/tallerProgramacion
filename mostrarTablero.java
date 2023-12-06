package proyectoTallerProgramacion.v5;

public class mostrarTablero {
    private static int nFilas = 11;
    private static int nColumnas = 11;
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
    /*
    public StringBuilder actualizarTablero(){
        System.out.print("TABLERO DE BUSCAMINAS(9x9) \n");
        System.out.print("\n  ");
        for (int j = 0; j < nColumnas; j++) { //Imprime el encabezado con el número de columnas
            System.out.print(" " + j + "  ");
        }
        System.out.print("\n  ");
        for (int j = 0; j < nColumnas; j++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 0; i < nFilas; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < nColumnas; j++) {
                if (descubiertas[i][j]) {
                    System.out.print(" " + tablero[i][j] + " |");
                } else {
                    System.out.print(" " + sCubierto + " |");
                }
            }
            System.out.println();
        }
    }*/

    public char [][] getTablero(){
        return tablero;
    }

    public static int getnFilas() {
        return nFilas;
    }

    public static int getnColumnas() {
        return nColumnas;
    }
}
