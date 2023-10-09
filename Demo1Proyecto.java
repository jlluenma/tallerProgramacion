import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        //Definición de variables
        String mallaVacia = """
                Columnas:  1   2   3
                Filas:  a| %s | %s | %s |
                        b| %s | %s | %s |
                        c| %s | %s | %s |
                """;
        Scanner lector = new Scanner(System.in);
        int nColumna;
        boolean perdiste = false;
        String mensajeFinal = "";
        String nFila;
        String celda1 = "♦";
        String celda2 = "♦";
        String celda3 = "♦";
        String celda4 = "♦";
        String celda5 = "♦";
        String celda6 = "♦";
        String celda7 = "♦";
        String celda8 = "♦";
        String celda9 = "♦";
        String vacio = " ";
        String bomba = "☺";
        String mallaInicio = String.format(mallaVacia,celda1,celda2,celda3,celda4,celda5,celda6,celda7,celda8,celda9);
        //Solicitud de datos al usuario
        System.out.println(mallaInicio);
        do{
        System.out.println("Ingrese la columna(1-3): ");
        nColumna = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese la fila(a-c): ");
        nFila = lector.nextLine();
        switch (nColumna) {
            case 1:
                switch (nFila) {
                    case "a":
                        celda1 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                    case "b":
                        celda4 = bomba;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        mensajeFinal = "¡Perdiste!";
                        perdiste = true;
                        break;
                    case "c":
                        celda7 = bomba;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        mensajeFinal = "¡Perdiste!";
                        perdiste = true;
                        break;
                }
            case 2:
                switch (nFila) {
                    case "a":
                        celda2 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                    case "b":
                        celda5 = bomba;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        mensajeFinal = "¡Perdiste!";
                        perdiste = true;
                        break;
                    case "c":
                        celda8 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                }
                break;
            case 3:
                switch (nFila) {
                    case "a":
                        celda3 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                    case "b":
                        celda6 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                    case "c":
                        celda9 = vacio;
                        mallaInicio = String.format(mallaVacia, celda1, celda2, celda3, celda4, celda5, celda6, celda7, celda8, celda9);
                        break;
                }
                break;
        }
            System.out.println(mallaInicio);
            System.out.println(mensajeFinal);
        }while (!perdiste);
    }
}
