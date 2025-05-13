package controlador;

import java.util.Scanner;

import modelo.Añadir;
import modelo.Eliminar;
import modelo.Modificar;
import modelo.Mostrar;
import vista.Menu;

public class GestionarVentas {
	public void mostrarMenuVentas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE VENTAS =====");
            System.out.println("1. Crear nueva venta");
            System.out.println("2. Listar ventas");
            System.out.println("3. Modificar ventas");
            System.out.println("4. Eliminar ventas");
            System.out.println("0. Volver al menú principal");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new Añadir().añadirVenta();
            } else if (opcion == 2) {
                new Mostrar().mostrarVenta();
            } else if (opcion == 3) {
                new Modificar().modificarVenta();
            } else if (opcion == 4) {
            	new Eliminar().eliminarVenta();
            } else if (opcion == 0) {
                System.out.println("\nVolviendo al menú principal...");
                new Menu().mostrarMenu();
            } else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
