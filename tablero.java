package proyectoTallerProgramacion.v6;

public class tablero {
    private static int nFilas = 11;
    private static int nColumnas = 11;
    private static  char sCubierto = '▀';
    private static char celdaVacia = ' ';

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
        for (int j = 1; j < nColumnas; j++) { //Imprime el encabezado con el número de columnas
            System.out.print(" " + j + "  ");
        }
        System.out.print("\n  ");
        for (int j = 1; j < nColumnas; j++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 1; i < nFilas; i++) {
            System.out.printf("%2d" + "|", i);
            for (int j = 1; j < nColumnas; j++) {
                if (bDescubiertas[i][j]) {
                    System.out.print(" " + cTabla[i][j] + " |");
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
