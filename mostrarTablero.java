package proyectoTallerProgramacion.v4;

public class mostrarTablero {
    private char sMina = '◉';
    private char sVacia = ' ';
    private char sCeldaCubierta = '▀';

    public int nFilas = 10;
    private int nColumnas = 10;
    private int nMinas = 10;
    private char[][] tablero;
    private boolean[][] minas;
    private boolean[][] descubiertas;
    private boolean[][] cubiertas;

    public mostrarTablero(int nFilas, int nColumnas, int nMinas, char sMina, char sVacia, char sCubierta, boolean[][] descubiertas, boolean[][] cubiertas) {
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
        this.nMinas = nMinas;
        this.sMina = sMina;
        this.sVacia = sVacia;
        this.sCeldaCubierta = sCubierta;
        this.descubiertas = descubiertas;
        this.cubiertas = cubiertas;

        // Crear una instancia de la clase 'tablero'
        tablero nuevoTablero = new tablero(this);

        // Llamar a la función para inicializar el tablero
        nuevoTablero.inicializarTablero(sCeldaCubierta);

        // Llamar a la función para colocar las minas
    }

    public int getnFilas() {
        return nFilas;
    }

    public void setnFilas(int nFilas) {
        this.nFilas = nFilas;
    }

    public int getnColumnas() {
        return nColumnas;
    }

    public int getnMinas() {
        return nMinas;
    }

    public char getsMina() {
        return sMina;
    }

    public void setMinas(boolean[][] minas) {
        this.minas = minas;
    }

    public char getsVacia() {
        return sVacia;
    }

    public char getsCeldaCubierta() {
        return sCeldaCubierta;
    }

    public boolean[][] getMinas() {
        return minas;
    }

    public boolean[][] getDescubiertas() {
        return descubiertas;
    }

    public boolean[][] getCubiertas() {
        return cubiertas;
    }
}
