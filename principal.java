package proyectoTallerProgramacion.v5;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        mostrarTablero tablero = new mostrarTablero();
        StringBuilder tableroInicial = tablero.inicializarTablero();
        lectorDatos establecerCoordenadas = new lectorDatos();
        juego nuevoJuego = new juego();
        Scanner scann = new Scanner(System.in);

            System.out.println(tableroInicial);
            System.out.println("Ingrese la fila: ");
            int fila = scann.nextInt();
            System.out.println("Ingrese la columna: ");
            int columna = scann.nextInt();
            //char[][] tableroA = nuevoJuego.descubrirCelda(fila, columna);
            establecerCoordenadas.establecerN(fila, columna);
    }
}
