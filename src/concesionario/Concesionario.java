package concesionario;

import java.util.ArrayList;

/**
 * Este paquete contiene las clases necesarias para gestionar la venta de coches en un concesionario.
 * @autor Daniel Labrador Maqueda
 * @version 1.0
 * @since 2024-03-20
 */
public class Concesionario {
    private ArrayList<Coche> inventario;

    /**
     * Constructor para crear un objeto Concesionario con un inventario vacío.
     */
    public Concesionario() {
        inventario = new ArrayList<>();
    }

    /**
     * Método para agregar un coche al inventario del concesionario.
     * @param coche El coche a agregar.
     */
    public void agregarCoche(Coche coche) {
        inventario.add(coche);
    }

    /**
     * Método para obtener el inventario del concesionario.
     * @return El inventario del concesionario.
     */
    public ArrayList<Coche> obtenerInventario() {
        return inventario;
    }
}