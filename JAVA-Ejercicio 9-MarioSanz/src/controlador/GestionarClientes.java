package controlador;

import java.util.Scanner;

import vista.Menu;

import modelo.*;

public class GestionarClientes {

    public void mostrarMenuClientes() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE CLIENTES =====");
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("0. Volver al menú principal");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new Añadir().añadirCliente();
            } else if (opcion == 2) {
                new Mostrar().mostrarCliente();
            } else if (opcion == 3) {
                new Modificar().modificarCliente();
            } else if (opcion == 4) {
            	new Eliminar().eliminarCliente();
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
