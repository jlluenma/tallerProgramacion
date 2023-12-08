package proyectoTallerProgramacion.v6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class jugar {
    int nFilas = tablero.getnFilas();
    int nColumnas = tablero.getnColumnas();
    private static char[][] cTabla;
    private static final char cMina = '◉';
    private static boolean [][] bMinas;
    boolean [][] bCubiertas;
    boolean [][] bDescubiertas;
    char celdaVacia = tablero.getCeldaVacia();
    tablero nuevoTablero = new tablero();
    validador nuevoValidador = new validador();
    minas minasA = new minas();

    public jugar() { //constructor
        cTabla = new char[nFilas][nColumnas];
        bMinas = new boolean[nFilas][nColumnas];
        bCubiertas = new boolean[nFilas][nColumnas];
        bDescubiertas = new boolean[nFilas][nColumnas];
        tablero.inicializarTablero(cTabla); //cTabla
        minas.colocarMinas(bMinas);
    }

    public void jugada() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            nuevoTablero.mostrarTablero(cTabla,bDescubiertas);
            try {
                System.out.print("Ingresa la fila (0-" + (nFilas - 1) + "): ");
                int fila = scanner.nextInt();
                System.out.print("Ingresa la columna (0-" + (nColumnas - 1) + "): ");
                int columna = scanner.nextInt();
                if ((fila >= 0 && fila < nFilas) && (columna>=0 && columna < nColumnas )){
                    descubrirCeldas(fila, columna);
                }else {
                    System.out.println("Coordenadas fuera de los límites del tablero. Inténtalo nuevamente");
                }
                // Verificar condición de victoria
                if (todasCeldasDescubiertas()) {
                    System.out.println("""
                            ・ﾟ✧*:・ﾟ✧*:・ﾟ✧*:・ﾟ✧*:・ﾟ✧(｡◕‿‿◕｡)*:・ﾟ✧*:・ﾟ✧*:・ﾟ✧*:・ﾟ✧*:・
                            ¡Felicidades! Has descubierto todas las celdas sin minas. ¡Has ganado!
                            """);
                    System.exit(0);
                }
            }catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar números enteros. Intenta nuevamente.");
                scanner.nextLine();  // Limpiar el buffer del scanner
            }
        }
    }

    // Método para verificar si todas las celdas sin minas han sido descubiertas
    private boolean todasCeldasDescubiertas() {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (!bMinas[i][j] && !bDescubiertas[i][j]) {
                    return false; // Hay al menos una celda sin mina no descubierta
                }
            }
        }
        return true; // Todas las celdas sin minas han sido descubiertas
    }

    public void descubrirCeldas(int nfila, int ncolumna){
        if (nuevoValidador.coordenadasValidas(nfila, ncolumna) && !bDescubiertas[nfila][ncolumna]) {
            bDescubiertas[nfila][ncolumna] = true;
            if (bMinas[nfila][ncolumna]) {
                cTabla[nfila][ncolumna] = cMina;
                nuevoTablero.mostrarTablero(cTabla,bDescubiertas);
                System.out.println("¡Has perdido! Has encontrado una mina.ಡ_ಡ");
                System.exit(0);
            } else {
                //verificar si la cantidad de  jugadas, si es menor al límite el jugador ganó
                int minasCercanas = minasA.contarMinasCercanas(nfila, ncolumna, bMinas);
                if (minasCercanas > 0) {
                    cTabla[nfila][ncolumna] = (char) (minasCercanas + '0');
                } else {
                    cTabla[nfila][ncolumna] = celdaVacia;
                    descubrirCeldas(nfila - 1, ncolumna - 1);
                    descubrirCeldas(nfila - 1, ncolumna);
                    descubrirCeldas(nfila - 1, ncolumna + 1);
                    descubrirCeldas(nfila, ncolumna - 1);
                    descubrirCeldas(nfila, ncolumna + 1);
                    descubrirCeldas(nfila + 1, ncolumna - 1);
                    descubrirCeldas(nfila + 1, ncolumna);
                    descubrirCeldas(nfila + 1, ncolumna + 1);
                }
            }
        }
    }
}
