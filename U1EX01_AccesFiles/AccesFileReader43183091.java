package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesFileReader43183091 {
    /*
     * 1
     * Declaramos clases privadas Filereader, que se usará para leer el archivo
     * y bufferreader, que se usará para leer el archivo de forma
     * eficiente
     */

    private FileReader reader;
    private BufferedReader bufferedReader;

    /*
     * 2
     * Hacemos un constructor al que le pasamos la ruta directamente metida en
     * una variable llamada archivo.
     * -----------------------------------------------------------------------------
     * Creamos un Filereader que apunta hacia la ruta.
     * -----------------------------------------------------------------------------
     * -
     * Instnaciamos un bufferedreader que usa el filereader para leer
     * de forma eficiente.
     * -----------------------------------------------------------------------------
     * --
     * Añadimos IOException
     * -----------------------------------------------------------------------------
     * -
     */
    public AccesFileReader43183091(String archivo) {
        try {
            this.reader = new FileReader(archivo);
            this.bufferedReader = new BufferedReader(this.reader);
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    /*
     * 3
     * Utilizamos el metodo leer linea, del bufferreader
     * Si se lee correctamente se devuelve como una cadena de string
     * Si ocurre algo saltará el IOExcepcion.
     */

    public String leerLinea() {
        try {
            return this.bufferedReader.readLine();
        } catch (IOException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * 4
     * Cerramos el archivo. En el casop de que el bufferread no sea null
     * proceder a cerrar. Si hay algún error saltará el IOExcepcion.
     */

    public void cerrarArchivo() {
        try {
            if (this.bufferedReader != null) {
                this.bufferedReader.close();
            }

            if (this.reader != null) {
                this.reader.close();
            }
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }
}
