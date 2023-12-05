package proyectoTallerProgramacion.v5;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        mostrarTablero tablero = new mostrarTablero();
        Scanner lector = new Scanner(System.in);
        juego nuevoJuego = new juego();

        StringBuilder tableroInicial = tablero.inicializarTablero();
        System.out.print(tableroInicial);

        int nFilas = mostrarTablero.nFilas;
        int nColumnas = mostrarTablero.nColumnas;

 /*       minas nuevoContador = new minas();
        int nMinas = nuevoContador.contarMinasCercanas(nFilas,nColumnas);*/
        while (true) {
            tablero.inicializarTablero();
            System.out.print("Ingresa la fila (0-" + (nFilas - 1) + "): ");
            nFilas = lector.nextInt();
            System.out.print("Ingresa la columna (0-" + (nColumnas - 1) + "): ");
            nColumnas = lector.nextInt();
            nuevoJuego.descubrirCelda(nFilas,nColumnas);
        }

    }
}
