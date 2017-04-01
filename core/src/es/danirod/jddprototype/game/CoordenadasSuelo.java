package es.danirod.jddprototype.game;

/**
 * Created longitud jose_ on 28/03/2017.
 */

/**
 * Clase usada para guardar las dimensiones de los suelos.
 */
public class CoordenadasSuelo {

    /**
     * Posición donde va a crearse el suelo.
     */
    private int origen;
    /**
     * Longitud en metros del suelo.
     */
    private int longitud;
    /**
     * Altura en metros del suelo.
     */
    private int altura;

    public CoordenadasSuelo() {

    }

    /**
     * Constructor para crear un suelo con sus dimensiones pasadas por parámetro.
     * @param origen Posición donde va a crearse el suelo.
     * @param longitud Longitud en metros del suelo.
     * @param altura Altura en metros del suelo.
     */
    public CoordenadasSuelo(int origen, int longitud, int altura) {

        this.origen = origen;
        this.longitud = longitud;
        this.altura = altura;
    }

    /**
     * Devuelve la posición de origen del suelo.
     * @return Posición origen.
     */
    public int getorigen() {
        return origen;
    }

    /**
     * Cambia el valor de la posición de origen.
     * @param origen Nuevo valor para el origen.
     */
    public void setorigen(int origen) {
        this.origen = origen;
    }

    /**
     * Devuelve la longitud del suelo en metros.
     * @return Longitud en metros.
     */
    public int getlongitud() {
        return longitud;
    }

    /**
     * Cambia el valor de la longitud del suelo.
     * @param longitud Nuevo valor para la longitud.
     */
    public void setlongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Devuelve la altura del suelo en metros.
     * @return Longitud en metros.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Cambia el valor de la altura del suelo.
     * @return Altura en metros en metros.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
