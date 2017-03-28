package es.danirod.jddprototype.game;

/**
 * Created by jose_ on 28/03/2017.
 */

/**
 * Clase usada para guardar las coordenadas de los pinchos.
 */
public class CoordenadasPinchos
{
    /**
     * Componente en el eje x.
     */
    private int x;
    /**
     * Componente en el eje y.
     */
    private int y;

    public CoordenadasPinchos() {

    }

    /**
     * Constructor para crear una coordenada con los valores pasados por parámetro.
     * @param x Componente x.
     * @param y Componente y.
     */
    public CoordenadasPinchos(int x, int y) {

        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve la componente x.
     * @return Componente x de la coordenada.
     */
    public int getX() {
        return x;
    }

    /**
     * Cambia el valor de la componente x.
     * @param x Componente x de la coordenada.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devuelve la componente y.
     * @return Componente y de la coordenada.
     */
    public int getY() {
        return y;
    }

    /**
     * Cambia el valor de la componente y.
     * @param y Componente y de la coordenada.
     */
    public void setY(int y) {
        this.y = y;
    }
}
