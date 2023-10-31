package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesFileRandom43183091S {

    /*
     * 1
     * Creamos la variable ruta.
     */
    String fileName = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFrFw";

    public AccesFileRandom43183091S(String fileName) {

        try {

            /*
             * 2
             * Crear un objeto RandomAccessFile para escribir en el archivo
             */

            RandomAccessFile raf = new RandomAccessFile(this.fileName, "rw");

            /*
             * 3
             * Escribir una cadena en formato UTF-8
             */

            raf.writeUTF("May the force be with you!");

            /*
             * 4
             * Mover la posición de lectura/escritura dentro del archivo
             * Mover al principio del archivo
             */

            raf.seek(0);
            /*
             * 5
             * Leer datos del archivo
             */

            String stringValue = raf.readUTF();
            /*
             * 6
             * Mostrar los datos leídos
             */

            System.out.println("Mensaje: " + stringValue);

            /*
             * 7
             * Cerrar el archivo
             */

            raf.close();
        } catch (

        /*
         * 8
         * Excepción
         */

        IOException e) {
            e.printStackTrace();
        }
    }
}
