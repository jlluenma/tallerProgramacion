package proyectoTallerProgramacion.v5;

public class validador {
    int nFilas = mostrarTablero.nFilas;
    int nColumnas = mostrarTablero.nColumnas;

    public boolean coordenadasValidas(int fila, int columna) {
        return fila >= 0 && fila < nFilas && columna >= 0 && columna < nColumnas;
    }
}
