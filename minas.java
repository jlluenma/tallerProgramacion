package proyectoTallerProgramacion.v4;

import java.util.Random;

public class minas {
    public static void colocarMinas(mostrarTablero tablero) {
        int nMinas = tablero.getnMinas();
        int nFilas = tablero.getnFilas();
        int nColumnas = tablero.getnColumnas();
        boolean[][] minas = tablero.getMinas();

        Random aleatorio = new Random();
        int minasColocadas = 0;

        while (minasColocadas < nMinas) {
            int fila = aleatorio.nextInt(nFilas);
            int columna = aleatorio.nextInt(nColumnas);

            if (!minas[fila][columna]) {
                minas[fila][columna] = true;
                minasColocadas++;
            }
        }
        tablero.setMinas(minas);
    }
}
