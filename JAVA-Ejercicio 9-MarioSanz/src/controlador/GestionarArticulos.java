package controlador;

import java.util.Scanner;

import modelo.Añadir;
import modelo.Eliminar;
import modelo.Modificar;
import modelo.Mostrar;
import vista.Menu;

public class GestionarArticulos {
	public void mostrarMenuArticulos() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE ARTICULOS =====");
            System.out.println("1. Crear nuevo articulo");
            System.out.println("2. Listar articulos");
            System.out.println("3. Modificar articulos");
            System.out.println("4. Eliminar articulos");
            System.out.println("0. Volver al menú principal");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
            	new Añadir().añadirArticulo();
            } else if (opcion == 2) {
                new Mostrar().mostrarArticulo();
            } else if (opcion == 3) {
                new Modificar().modificarArticulo();
            } else if (opcion == 4) {
            	new Eliminar().eliminarArticulo();
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
