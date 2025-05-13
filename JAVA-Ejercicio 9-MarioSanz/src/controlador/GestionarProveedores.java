package controlador;

import vista.Menu;

import java.util.Scanner;

import modelo.*;


public class GestionarProveedores {
	public void mostrarMenuProveedores() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE PROVEEDORES =====");
            System.out.println("1. Crear nuevo proveedor");
            System.out.println("2. Listar proveedores");
            System.out.println("3. Modificar proveedores");
            System.out.println("4. Eliminar proveedores");
            System.out.println("0. Volver al menú principal");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new Añadir().añadirProveedor();
            } else if (opcion == 2) {
                new Mostrar().mostrarProveedor();
            } else if (opcion == 3) {
                new Modificar().modificarProveedor();
            } else if (opcion == 4) {
            	new Eliminar().eliminarProveedor();
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
