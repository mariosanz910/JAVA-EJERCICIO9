package controlador;

import java.util.Scanner;

import modelo.Añadir;
import modelo.Eliminar;
import modelo.Modificar;
import modelo.Mostrar;
import vista.Menu;

public class GestionarFacturas {
	public void mostrarMenuFacturas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE FACTURAS =====");
            System.out.println("1. Crear nueva factura");
            System.out.println("2. Listar facturas");
            System.out.println("3. Modificar facturas");
            System.out.println("4. Eliminar facturas");
            System.out.println("0. Volver al menú principal");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new Añadir().añadirFactura();
            } else if (opcion == 2) {
                new Mostrar().mostrarFacturas();
            } else if (opcion == 3) {
                new Modificar().modificarFactura();
            } else if (opcion == 4) {
            	new Eliminar().eliminarFactura();
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
