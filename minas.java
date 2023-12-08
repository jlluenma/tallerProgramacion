package proyectoTallerProgramacion.v6;

import java.util.Random;

public class minas {
    private static final int nMinas = 10;
    private static final int nFilas = tablero.getnFilas();
    private static final int nColumnas = tablero.getnColumnas();
    static Random aleatorio = new Random();
    static validador nuevoValidador = new validador();

    public static void colocarMinas(boolean[][] bMinas) {
        int minasColocadas = 0;
        while (minasColocadas < nMinas) { //Coloca minas mientras sea menor a 10
            int fila = aleatorio.nextInt(nFilas);
            int columna = aleatorio.nextInt(nColumnas); //Coloca minas en coordenadas aleatorias
            if (!bMinas[fila][columna]) { //Verifica si ya existe una mina en esa posición
                bMinas[fila][columna] = true;
                minasColocadas++;
            }
        }
    }
    public int contarMinasCercanas(int fila, int columna, boolean [][] bMinas) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                    if (nuevoValidador.coordenadasValidas(i, j) && bMinas[i][j]) {
                        contador++;
                    }
            }
        }
        return contador;
    }
}
