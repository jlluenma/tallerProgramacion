package proyectoTallerProgramacion.v5;

import java.util.Random;

public class minas {
    private static final int nMinas = 10;
    boolean[][] minas = mostrarTablero.minas;
    int nFilas = mostrarTablero.nFilas;
    int nColumnas = mostrarTablero.nColumnas;
    Random aleatorio = new Random();
    validador nuevoValidador = new validador();

    public boolean[][] colocarMinas() {
        int minasColocadas = 0;
        while (minasColocadas < nMinas) { //Coloca minas mientras sea menor a 10
            int fila = aleatorio.nextInt(nFilas);
            int columna = aleatorio.nextInt(nColumnas); //Coloca minas en coordenadas aleatorias
            if (!minas[fila][columna]) { //Verifica si ya existe una mina en esa posición
                minas[fila][columna] = true;
                minasColocadas++;
            }
        }
        return minas;
    }

    public int contarMinasCercanas(int fila, int columna) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (nuevoValidador.coordenadasValidas(i, j) && minas[i][j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

}
