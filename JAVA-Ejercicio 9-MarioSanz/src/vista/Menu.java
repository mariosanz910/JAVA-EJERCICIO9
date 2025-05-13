package vista;

import java.util.Scanner;
import controlador.*;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Proveedores");
            System.out.println("3. Gestión de Artículos");
            System.out.println("4. Gestión de Facturas Recibidas");
            System.out.println("5. Gestión de Ventas");
            System.out.println("6. Informe de Ventas por Cliente");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new GestionarClientes().mostrarMenuClientes();
            } else if (opcion == 2) {
            	new GestionarProveedores().mostrarMenuProveedores();
            } else if (opcion == 3) {
            	new GestionarArticulos().mostrarMenuArticulos();
            } else if (opcion == 4) {
                new GestionarFacturas().mostrarMenuFacturas();
            } else if (opcion == 5) {
                new GestionarVentas().mostrarMenuVentas();
            } else if (opcion == 6) {
                new GenerarFactura().generarFactura();
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
