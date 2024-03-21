package concesionario;

/**
 * Clase que representa un coche en el inventario del concesionario.
 * @autor Daniel Labrador Maqueda
 * @version 1.0
 * @since 2024-03-20
 */
public class Coche {
    private String marca;
    private String modelo;
    private double precio;

    /**
     * Constructor para crear un objeto Coche con la marca, modelo y precio especificados.
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     * @param precio El precio del coche.
     */
    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * Método para obtener la marca del coche.
     * @return La marca del coche.
     */
    public String obtenerMarca() {
        return marca;
    }

    /**
     * Método para obtener el modelo del coche. Esta función está marcada como @deprecated.
     * @deprecated Era una funcion obsoleta y la hemos mejorado.
     * @param tipo El tipo de modelo (este parámetro se ignora).
     * @return El modelo del coche.
     * @see #obtenerModelo()
     * @since 2024-03-20
     */
    @Deprecated
    public String obtenerModelo(String tipo) {
        return modelo;
    }

    /**
     * Método para obtener el modelo del coche.
     * @return El modelo del coche.
     */
    public String obtenerModelo() {
        return modelo;
    }

    /**
     * Método para obtener el precio del coche.
     * @return El precio del coche.
     */
    public double obtenerPrecio() {
        return precio;
    }
}