import concesionario.Coche;
import concesionario.Concesionario;

/**
 * Clase principal que prueba las funcionalidades de las clases Coche y Concesionario.
 * Permite crear coches, agregarlos al inventario del concesionario y mostrar el inventario.
 * @autor Daniel Labrador Maqueda
 * @version 1.0
 * @since 2024-03-20
 */
public class ClasePrincipal {

    /**
     * Método principal que crea coches, los agrega al inventario del concesionario y muestra el inventario.
     * @param args Argumentos de línea de comandos (no se utiliza en este caso).
     * @return No devuelve ningún valor.
     */
    public static void main(String[] args) {
        // Crear un coche y mostrar sus detalles
        Coche coche1 = new Coche("Toyota", "Corolla", 25000.00);
        System.out.println("Marca: " + coche1.obtenerMarca());
        System.out.println("Modelo: " + coche1.obtenerModelo());
        System.out.println("Precio: $" + coche1.obtenerPrecio());

        // Crear un segundo coche y mostrar sus detalles
        Coche coche2 = new Coche("Ford", "Fiesta", 20000.00);
        System.out.println("\nMarca: " + coche2.obtenerMarca());
        System.out.println("Modelo: " + coche2.obtenerModelo());
        System.out.println("Precio: $" + coche2.obtenerPrecio());

        // Crear un concesionario y agregar coches
        Concesionario concesionario = new Concesionario();
        concesionario.agregarCoche(coche1);
        concesionario.agregarCoche(coche2);

        System.out.println();
        System.out.println();

        // Mostrar el inventario del concesionario
        System.out.println("Inventario del Concesionario:");
        for (Coche coche : concesionario.obtenerInventario()) {
            System.out.println("Marca: " + coche.obtenerMarca());
            System.out.println("Modelo: " + coche.obtenerModelo());
            System.out.println("Precio: $" + coche.obtenerPrecio());
            System.out.println();
        }
    }
}