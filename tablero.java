package proyectoTallerProgramacion.v4;

public class tablero {
    private char[][] tablero;

    public char[][] getTablero() {
        return tablero;
    }

    public tablero(mostrarTablero padre) {
        this.tablero = new char[padre.getnFilas()][padre.getnColumnas()];
        inicializarTablero(padre.getsCeldaCubierta());
        minas.colocarMinas(padre);  // Llamada directa al método colocarMinas
    }

    public void inicializarTablero(char sCeldaCubierta) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = sCeldaCubierta;
            }
        }
        minas.colocarMinas();
    }
}
