package proyectoTallerProgramacion.v6;

public class validador {
    int nFilas = tablero.getnFilas();
    int nColumnas = tablero.getnColumnas();

     public boolean coordenadasValidas(int fila, int columna) {
        return fila >= 0 && fila < nFilas && columna >= 0 && columna < nColumnas;
    }
}
