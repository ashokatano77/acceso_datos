package U1EX02_ManegementFiles;

//INÉS DE LA CAL PÉREZ- Acividad2 Management of files- Acceso BBDD- 1ºEVALUACIÓN

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------------------------------------
        /*
         * UNO
         * - Hago un archivo de texto en el directorio del programa, para poder hacer
         * pruebas.
         * Si te fijas se llama act2b.txt
         * - Hago la clase scanner para poder leer lo que el usuario introduzca
         * - Le digo que meta la ruta y el texto, y los guardo en sus respectivos
         * Strings
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("ruta");
        String ruta = sc.nextLine();
        System.out.println("Introduce el texto");
        String texto = sc.nextLine();
        // ----------------------------------------------------------------------------------------------------------------------
        /*
         * DOS
         * -Creo un StringBuilder llamado resultado para ir almacenando las letras del
         * texto que voy
         * a ir cambiando
         * -Hago un bucle for para que vaya iterando a traves de las letras del texto
         * -Hago una variable char:c para ir guardando la letra que itere en ese momento
         * -Character.isUpperCase(c). Le digo que si la letra es mayúsucla, que la
         * convierta a minuscula
         * resultado.append(Character.toLowerCase(c), y que vaya acuumulando el
         * resultado
         * -En el else if; Si la letra es minuscula que lo convierta a mayuscula
         * Character.toUpperCase(c).
         * -En el else; Añado que si hay algun caracter no alfabético, no hay que hacer
         * nada.
         */

        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c); // Mantener caracteres no alfabéticos sin cambios
            }
        }
        // ----------------------------------------------------------------------------------------------------------------------
        /*
         * TRES
         * - Hago una clase fileWriter, donde pongo la ruta suministrada y el append
         * false para no sobrecargar
         * el archivo
         * - Luego le digo que escriba en el archivo el resultado (que es el texto
         * alterado)
         * fileWriter.write(String.valueOf(resultado)); convierte el contenido del
         * stringbuilder en string.
         * Osea, Lo que se ha construido en resultado, lo mete en el string. Mediente el
         * metodo write lo escribe en
         * el archivo.
         * - Cierro el archivo
         * - Si ha ido bien aparecerá el mensaje:
         * System.out.println("Se ha transferido la informacion bien");
         */

        try {
            // Escribir el texto en el fichero
            FileWriter fileWriter = new FileWriter(ruta, false);
            fileWriter.write(String.valueOf(resultado));

            fileWriter.close();
            System.out.println("Se ha transferido la informacion bien");

            // ----------------------------------------------------------------------------------------------------------------------
            /*
             * CUATRO
             * - Añado un IOException e, que se lanzará si hay problemas relacionados con
             * las operaciones de entradas y salidas
             * - Si hay algún probleam se alnzará un mensaje en rojo, diciendo que ha habido
             * un error.
             */

        } catch (IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }

    }

}
