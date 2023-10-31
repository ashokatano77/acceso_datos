package U1EX01_AccesFiles;

// INÉS DE LA CAL PEREZ- 2º DAM- ACCESO A BASE DE DATOS- ACTIVIDAD1accesFiles
public class Main {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------------------------------------

        System.out.println("----------------FILE WRITER/FILE READER--------------------");

        // Invocamos la clase Fw (que hace funcion de FileWriter).Escribimos un
        // mensaje.Cerramos archivo
        AccesFileReaderWriter43183091S archivo = new AccesFileReaderWriter43183091S(
                "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFrFw.txt");
        archivo.escribirEnArchivo("Menaje escrito en el archivo FrFW.txt⠀");
        archivo.cerrarArchivo();
        System.out.println("Mensaje del FileWriter insertado con éxto en el archivo correspondiente");

        // Invocamos la clase Fr (que hace funcion de FileReader). Añadimos el St de la
        // ruta.
        String nombreArchivo = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFrFw.txt";
        AccesFileReader43183091 fileReader = new AccesFileReader43183091(nombreArchivo);

        // invocamos el método leer linea, guardamos lo que lea en el String Linea,
        // cerramos el archivo
        String linea;
        try {
            while ((linea = fileReader.leerLinea()) != null) {
                System.out.println(linea);
            }
        } finally {
            fileReader.cerrarArchivo();
        }

        // ---------------------------------------------------------------------------------------------------

        System.out.println("----------------FILE INPUTSTREAM-FILE OUTPUTSTREAM--------------------");

        // Invoco el FILE OUTPUTSTREAM para que escriba en el archivo en cuestión.
        new AccesFileOutputStream43183091S(
                "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFISFOS.txt");

        // Meto la ruta del archivo en un St
        String ArchivoFisFos = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFISFOS.txt";

        // Invoco el FILE IMPUTSTREAM y le pongo el St recién hecho entre los paréntesis
        new AccesFileInputStream43183091S(ArchivoFisFos);

        // ---------------------------------------------------------------------------------------------------

        System.out.println("----------------RANDOM ACCES FILE----------------------");

        // Invoco el RANDOM ACCES FILE y le pongo el St recién hecho entre los
        // paréntesis
        String fileName = "C:\\Users\\alumne-DAM.DESKTOP-ODR0FV0\\Documents\\GitHub\\acceso_datos\\U1EX01_AccesFiles\\archivoFrFw.txt";
        new AccesFileRandom43183091S(fileName);

    }
}