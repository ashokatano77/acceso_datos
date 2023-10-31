package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
import java.io.FileWriter;
import java.io.IOException;

public class AccesFileReaderWriter43183091S {
    /*
     * 1
     * Hacemos un atributo privado Filewriter, que usaremos para
     * esribir en el archivo
     */

    private FileWriter writer;

    /*
     * 2
     * Hacemos un constructor que toma como argumento "archivo", que representa
     * la ruta del archivo donde vamos a escribir. Append false para que el
     * contenido se vaya
     * sobreescribiendo en este caso.
     * IOException por si hay algún problema.
     */

    public AccesFileReaderWriter43183091S(String archivo) {
        try {
            this.writer = new FileWriter(archivo, false);
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    /*
     * 3
     * Hacemos un método que toma como arumento el texto, que es donde vamos
     * a guardar lo que se escriba.
     * Dentro usamos el método write, perteneciente al filewriter, que es lo que
     * escribirá en el
     * archivo.
     * Añadimos el método flush, que hará que los datos se escriban directamente
     * en lugar de esperar a que se realice una operacion en el buffer. (esto último
     * no lo entiendo bien)
     * IOException para los errores
     */

    public void escribirEnArchivo(String texto) {
        try {
            this.writer.write(texto);
            this.writer.flush();
        } catch (IOException var3) {
            var3.printStackTrace();

            // EN LAS EXCEPCIONES SE CIERRAN TODOS LOS OBJETOS QUE SE UTILIZAN
            // TAL CUAL LO CREAS LO CIERRAS
            cerrarArchivo();
            /*
             * if (this.writer != null) {
             * try {
             * this.writer.close();
             * } catch (IOException e) {
             * throw new RuntimeException(e);
             * }
             * }
             */
        }

    }

    /*
     * 4
     * Hacemos un método para cerrar el archivo.
     * Le estamos diciendo que si this.writer no es nulo,
     * que cierre el FileWriter.
     * Pongo IOE para errores.
     */

    public void cerrarArchivo() {
        try {
            if (this.writer != null) {
                this.writer.close();
            }
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }
}
