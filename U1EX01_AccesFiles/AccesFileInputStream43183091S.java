package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
import java.io.FileInputStream;
import java.io.IOException;

public class AccesFileInputStream43183091S {

    /*
     * 1
     * Creamos la variable ruta y la variable FinputStream
     */

    String nombreArchivo2 = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFISFOS.txt";
    FileInputStream archivoEntrada = null;

    /*
     * 2
     * Hacemos un constructor poniendo como argumento la ruta, instanciamos el
     * FiMPUTsT.
     * ------------------------------------------------
     * Creamos un buffer con tamaño de 1024 bytes,
     * Utilizamos un bucle while para leer el contenido del archivo en bloques de
     * 1024 y mostrarlo en consola
     * -----------------------------------
     * Se usa this.archivoEntrada.read(datos) para leer datos del archivo
     * en el buffer datos. El método read devuelve la cantidad de bytes leidos -1,
     * que es cuando llega al funal del archivo
     * --------------------------------------------------
     * Creamos el sT contenido a partior de los datos leidos, especificando
     * el inicio y la cantidad de bytes leidos.
     * --------------------------------------------------
     * Se muestra el contenido en consola
     * 
     */
    public AccesFileInputStream43183091S(String archivo) {
        try {
            this.archivoEntrada = new FileInputStream(this.nombreArchivo2);
            byte[] datos = new byte[1024];

            int CantidadLeida;
            while ((CantidadLeida = this.archivoEntrada.read(datos)) != -1) {
                String Contenido = new String(datos, 0, CantidadLeida);
                System.out.println(Contenido);
            }

            /*
             * 3
             * Añadimos excepción por si hay algun error.
             */

        } catch (IOException var13) {
            var13.printStackTrace();

            /*
             * 4
             * Cerramos el archivo
             */

        } finally {
            try {
                if (this.archivoEntrada != null) {
                    this.archivoEntrada.close();
                }
            } catch (IOException var12) {
                System.err.println("Hubo un error");
                var12.printStackTrace();
            }

        }

    }
}
