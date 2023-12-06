package proyectoTallerProgramacion.v5;

public class lectorDatos {
        private static int fila;
        private static int columna;

        public void establecerN(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }

        public static int getFila() {
            return fila;
        }

        public static int getColumna() {
            return columna;
        }
    }
