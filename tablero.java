package proyectoTallerProgramacion.v6;

public class tablero {
    private static final int nFilas = 11;
    private static final int nColumnas = 11;
    private static final char sCubierto = '▀';
    private static final char celdaVacia = ' ';

    public static void inicializarTablero(char [][] cTabla) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                cTabla[i][j] = sCubierto;
            }
        }
    }

    public void mostrarTablero(char [][] cTabla, boolean[][] bDescubiertas) {
        System.out.print("TABLERO DE BUSCAMINAS(9x9) \n");
        System.out.print("\n  ");
        for (int j = 0; j < nColumnas; j++) { //Imprime el encabezado con el número de columnas
            System.out.printf("%3d ", j); //" " + j + "  "
        }
        System.out.print("\n  ");
        for (int j = 0; j < nColumnas; j++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 0; i < nFilas; i++) {
            System.out.printf("%2d|", i); //"%2d" + "|", i
            for (int j = 0; j < nColumnas; j++) {
                if (bDescubiertas[i][j]) {
                    System.out.printf("%2c |" , cTabla[i][j]); //" " + cTabla[i][j] + " |"
                } else {
                    System.out.print(" " + sCubierto + " |");
                }
            }
            System.out.println();
        }
    }
    public static int getnFilas() {
        return nFilas;
    }
    public static int getnColumnas() {
        return nColumnas;
    }
    public static char getCeldaVacia() {return celdaVacia;}
}
