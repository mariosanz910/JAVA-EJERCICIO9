package modelo;

import java.sql.*;
import java.util.Scanner;

public class Modificar {
	public void modificarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID del cliente a modificar: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); 

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();

            System.out.print("Nuevo email: ");
            String nuevoEmail = scanner.nextLine();

            System.out.print("Nuevo teléfono: ");
            String nuevoTelefono = scanner.nextLine();

            String actualizar = "UPDATE Clientes SET nombre = '" + nuevoNombre + "', " + "email = '" + nuevoEmail + "', telefono = '" + nuevoTelefono + "' " + "WHERE id_cliente = " + idCliente;
            stmt.executeUpdate(actualizar); 

            System.out.println("Cliente modificado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar cliente: " + e.getMessage());
        }
    }
	
	public void modificarProveedor() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("ID del proveedor a modificar: ");
        int idProveedor = scanner.nextInt();
        scanner.nextLine(); 

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();

            System.out.print("Nuevo cif: ");
            String nuevoCif = scanner.nextLine();

            System.out.print("Nuevo teléfono: ");
            String nuevoTelefono = scanner.nextLine();

            String actualizar = "UPDATE Proveedores SET nombre = '" + nuevoNombre + "', " + "cif = '" + nuevoCif + "', telefono = '" + nuevoTelefono + "' " + "WHERE id_proveedor = " + idProveedor;
            stmt.executeUpdate(actualizar); 

            System.out.println("Proveedor modificado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar proveedor: " + e.getMessage());
        }
	}
	
	public void modificarArticulo() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("ID del articulo a modificar: ");
        int idArticulo = scanner.nextInt();
        scanner.nextLine(); 

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();

            System.out.print("Nuevo Precio: ");
            String nuevoPrecio = scanner.nextLine();

            System.out.print("Nuevo Stock: ");
            String nuevoStock = scanner.nextLine();

            String actualizar = "UPDATE Articulos SET nombre = '" + nuevoNombre + "', " + "precio_unitario = '" + nuevoPrecio + "', stock = '" + nuevoStock + "' " + "WHERE id_articulo = " + idArticulo;
            stmt.executeUpdate(actualizar); 

            System.out.println("Articulo modificado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar articulo: " + e.getMessage());
        }
	}
	
	public void modificarFactura() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("ID de la factua a modificar: ");
        int idFactura = scanner.nextInt();
        scanner.nextLine(); 

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

        	new Mostrar().mostrarProveedor();
            System.out.print("\n");
            System.out.print("\nNuevo proveedor (por id): ");
            String nuevoProveedor = scanner.nextLine();

            System.out.print("Nueva Fecha (formato AAAA-MM-DD): ");
            String nuevaFecha = scanner.nextLine();

            System.out.print("Nuevo Total: ");
            String total = scanner.nextLine();

            String actualizar = "UPDATE Facturas_Recibidas SET id_proveedor = '" + nuevoProveedor + "', " + "fecha = '" + nuevaFecha + "', total = '" + total + "' " + "WHERE id_factura = " + idFactura;
            stmt.executeUpdate(actualizar); 

            System.out.println("Factura modificado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar la factura: " + e.getMessage());
        }
	}
	
	public void modificarVenta() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("ID de la venta a modificar: ");
        int idVenta = scanner.nextInt();
        scanner.nextLine(); 

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

        	new Mostrar().mostrarCliente();
            System.out.print("\n");
            System.out.print("\nNuevo Cliente (por id): ");
            String nuevoCliente = scanner.nextLine();
            
        	new Mostrar().mostrarArticulo();
            System.out.print("\n");
            System.out.print("\nNuevo Articulo (por id): ");
            String nuevoArticulo = scanner.nextLine();

            System.out.print("Cantidad: ");
            String nuevaCantidad = scanner.nextLine();

            System.out.print("Fecha nueva (formato AAAA-MM-DD): ");
            String fecha_venta = scanner.nextLine();

            String actualizar = "UPDATE Ventas SET id_cliente = '" + nuevoCliente + "', " + "id_articulo = '" + nuevoArticulo + "', cantidad = '" + nuevaCantidad + "', fecha_venta = '" + fecha_venta + "' " + "WHERE id_venta = " + idVenta;
            stmt.executeUpdate(actualizar); 

            System.out.println("Venta modificada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar la venta: " + e.getMessage());
        }
	}
}
