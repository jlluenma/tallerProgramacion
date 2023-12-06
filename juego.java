package proyectoTallerProgramacion.v5;

public class juego {
    validador nuevoValidador = new validador();
    minas nuevoContador = new minas();
    mostrarTablero mismoTablero = new mostrarTablero();
    char sCubierto = mostrarTablero.sCubierto;
    char [][] tablero = mismoTablero.getTablero();
    boolean[][] minas = nuevoContador.colocarMinas();
    boolean[][] descubiertas = mostrarTablero.descubiertas;
    private static final char sMina = '◉';

    public char [][] descubrirCelda(int fila, int columna) {
        if (nuevoValidador.coordenadasValidas(fila, columna) && !descubiertas[fila][columna]) {
            descubiertas[fila][columna] = true;
            if (minas[fila][columna]) {
                tablero[fila][columna] = sMina;
                mismoTablero.inicializarTablero();
                System.out.println("¡Has perdido! Has encontrado una mina.");
                System.exit(0);
            } else {
                int minasCercanas = nuevoContador.contarMinasCercanas(fila, columna);
                if (minasCercanas > 0) {
                    tablero[fila][columna] = (char) (minasCercanas + '0');
                } else {
                    tablero[fila][columna] = sCubierto; //sVacias
                    descubrirCelda(fila - 1, columna - 1);
                    descubrirCelda(fila - 1, columna);
                    descubrirCelda(fila - 1, columna + 1);
                    descubrirCelda(fila, columna - 1);
                    descubrirCelda(fila, columna + 1);
                    descubrirCelda(fila + 1, columna - 1);
                    descubrirCelda(fila + 1, columna);
                    descubrirCelda(fila + 1, columna + 1);
                }
            }
        }
        return tablero;
    }
}
