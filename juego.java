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

    public void descubrirCelda(int nFilas, int nColumnas) {
        if (nuevoValidador.coordenadasValidas(nFilas, nColumnas) && !descubiertas[nFilas][nColumnas]) {
            descubiertas[nFilas][nColumnas] = true;
            if (minas[nFilas][nColumnas]) {
                tablero[nFilas][nColumnas] = sMina;
                mismoTablero.inicializarTablero();
                System.out.println("¡Has perdido! Has encontrado una mina.");
                System.exit(0);
            } else {
                int minasCercanas = nuevoContador.contarMinasCercanas(nFilas, nColumnas);
                if (minasCercanas > 0) {
                    tablero[nFilas][nColumnas] = (char) (minasCercanas + '0');
                } else {
                    tablero[nFilas][nColumnas] = sCubierto; //sVacias
                    descubrirCelda(nFilas - 1, nColumnas - 1);
                    descubrirCelda(nFilas - 1, nColumnas);
                    descubrirCelda(nFilas - 1, nColumnas + 1);
                    descubrirCelda(nFilas, nColumnas - 1);
                    descubrirCelda(nFilas, nColumnas + 1);
                    descubrirCelda(nFilas + 1, nColumnas - 1);
                    descubrirCelda(nFilas + 1, nColumnas);
                    descubrirCelda(nFilas + 1, nColumnas + 1);
                }
            }
        }
    }
}
