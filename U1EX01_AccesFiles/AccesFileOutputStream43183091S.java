package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
import java.io.FileOutputStream;
import java.io.IOException;

public class AccesFileOutputStream43183091S {
    /*
     * 1
     * Hacemos dos atributos provados, uno para la ruta y otro
     * para el FOutputStr.
     */
    String nombreArchivo = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFISFOS.txt";
    FileOutputStream archivoSalida = null;

    /*
     * 2
     * Hacemos un constructor al que le damos de argumento la ruta.
     * -----------------------------------------------------------------------------
     * ----------
     * Instanaciamos el FOutputStr, que paunta hacia el archivo en cuestión.
     * -----------------------------------------------------------------------------
     * ----------
     * Ponemos el append en false para que se sobreescriba y no llenar
     * innecesariamente
     * el archivo con esta prueba.
     * -----------------------------------------------------------------------------
     * ----------
     * Si ha ido bien saldrá un mensaje en el main "Halcón milenario en camino"
     */

    public AccesFileOutputStream43183091S(String nombreArchivo) {
        try {
            this.archivoSalida = new FileOutputStream(nombreArchivo, false);
            String texto = "Mensaje insertado con File OutputStream";
            byte[] bytes = texto.getBytes();
            this.archivoSalida.write(bytes);
            System.out.println("Mensaje insertado en el archivo FISFOS.txt con éxito");

            /*
             * 3
             * La excepción saltará si hay algún problema, incluyendo un mensaje
             */
        } catch (IOException var12) {
            System.err.println("Hubo un error");
            var12.printStackTrace();

            /*
             * 4
             * Cerramos el archivo
             */
        } finally {
            try {
                if (this.archivoSalida != null) {
                    this.archivoSalida.close();
                }
            } catch (IOException var11) {
                var11.printStackTrace();
            }

        }

    }
}
