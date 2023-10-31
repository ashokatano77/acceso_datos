import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class U1EX03_ICCP {
    private Document document;

    // Constructor que inicializa el documento XML
    public U1EX03_ICCP () {
        try {
            // Crear un nuevo documento XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.newDocument();
            Element root = document.createElement("videojuegos");
            document.appendChild(root);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar un videojuego al documento
    public void agregarVideojuego(String titulo, String creador, String sinopsis, String plataforma, String creadoEn) {
        Element videojuego = document.createElement("videojuego");

        // Agregar el título del videojuego
        Element tituloElement = document.createElement("titulo");
        tituloElement.appendChild(document.createTextNode(titulo));
        videojuego.appendChild(tituloElement);

        // Agregar el nombre del creador
        Element creadorElement = document.createElement("creador");
        creadorElement.appendChild(document.createTextNode(creador));
        videojuego.appendChild(creadorElement);

        // Agregar la sinopsis
        Element sinopsisElement = document.createElement("sinopsis");
        sinopsisElement.appendChild(document.createTextNode(sinopsis));
        videojuego.appendChild(sinopsisElement);

        // Agregar la plataforma
        Element plataformaElement = document.createElement("plataforma");
        plataformaElement.appendChild(document.createTextNode(plataforma));
        videojuego.appendChild(plataformaElement);

        // Agregar el atributo "creado_en" que contiene la abreviación del país de creación
        videojuego.setAttribute("creado_en", creadoEn);

        // Agregar el videojuego al documento
        document.getDocumentElement().appendChild(videojuego);
    }

    // Método para mostrar el contenido del documento XML
    public void mostrarContenido() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);

            // Imprimir el documento XML en la consola
            StreamResult result = new StreamResult(new StringWriter());
            transformer.transform(source, result);

            System.out.println(result.getWriter().toString());
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    // Método para modificar el título de un videojuego
    public void modificarVideojuego(String tituloActual, String nuevoTitulo) {
        NodeList videojuegos = document.getElementsByTagName("videojuego");
        for (int i = 0; i < videojuegos.getLength(); i++) {
            Element videojuego = (Element) videojuegos.item(i);
            Element tituloElement = (Element) videojuego.getElementsByTagName("titulo").item(0);
            String titulo = tituloElement.getTextContent();
            if (titulo.equals(tituloActual)) {
                tituloElement.setTextContent(nuevoTitulo);
            }
        }
    }

    // Método para eliminar un videojuego por título
    public void eliminarVideojuego(String titulo) {
        NodeList videojuegos = document.getElementsByTagName("videojuego");
        for (int i = 0; i < videojuegos.getLength(); i++) {
            Element videojuego = (Element) videojuegos.item(i);
            Element tituloElement = (Element) videojuego.getElementsByTagName("titulo").item(0);
            String tituloActual = tituloElement.getTextContent();
            if (tituloActual.equals(titulo)) {
                Node parent = videojuego.getParentNode();
                parent.removeChild(videojuego);
            }
        }
    }

    // Método para guardar las modificaciones en un nuevo archivo XML
    public void guardarModificaciones(String nombreArchivo) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);

            // Guardar el documento XML modificado en un nuevo archivo
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Crear una instancia del editor de videojuegos
        U1EX03_ICCP editor = new U1EX03_ICCP();
    
        // Agregar videojuegos al documento
        editor.agregarVideojuego("Juego1", "Creador1", "Sinopsis1", "Plataforma1", "USA");
        editor.agregarVideojuego("Juego2", "Creador2", "Sinopsis2", "Plataforma2", "ESP");
        editor.agregarVideojuego("Juego3", "Creador3", "Sinopsis3", "Plataforma3", "JPN");
        editor.agregarVideojuego("Juego4", "Creador4", "Sinopsis4", "Plataforma4", "UK");
        editor.agregarVideojuego("Juego5", "Creador5", "Sinopsis5", "Plataforma5", "GER");
    
        // Modificar dos videojuegos
        editor.modificarVideojuego("Juego1", "Nuevo Juego1");
        editor.modificarVideojuego("Juego3", "Nuevo Juego3");
    
        // Eliminar un videojuego
        editor.eliminarVideojuego("Juego5");
    
        // Mostrar el contenido del documento XML
        System.out.println("Contenido del documento XML:");
        editor.mostrarContenido();
    
        // Guardar las modificaciones en un nuevo archivo XML
        editor.guardarModificaciones("modificado.xml");
    
        System.out.println("Modificaciones guardadas en 'modificado.xml'");
    }

}
    
        // Guardar las modificaciones en un nuevo
