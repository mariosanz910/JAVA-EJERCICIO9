package modelo;

import java.sql.*;
import java.util.Scanner;

public class Añadir {

    public void añadirCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java9";  
        String usuario = "root";
        String contrasena = "1234";  

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = conexion.createStatement()) {

            String insertar = "INSERT INTO Clientes (nombre, email, telefono) " + "VALUES ('" + nombre + "', '" + email + "', '" + telefono + "')";
            stmt.executeUpdate(insertar);

            System.out.println("Cliente añadido correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al añadir cliente: " + e.getMessage());
        }
    }
    
    public void añadirProveedor() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del proveedor: ");
        String nombre = scanner.nextLine();

        System.out.print("Cif: ");
        String cif = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java9";  
        String usuario = "root";
        String contrasena = "1234";  

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = conexion.createStatement()) {

            String insertar = "INSERT INTO Proveedores (nombre, cif, telefono) " + "VALUES ('" + nombre + "', '" + cif + "', '" + telefono + "')";
            stmt.executeUpdate(insertar);

            System.out.println("Proveedor añadido correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al añadir proveedor: " + e.getMessage());
        }
    }
    public void añadirArticulo() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del Artículo: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio unitario: ");
        String precio = scanner.nextLine();

        System.out.print("Stock: ");
        String stock = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java9";  
        String usuario = "root";
        String contrasena = "1234";  

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = conexion.createStatement()) {

            String insertar = "INSERT INTO Articulos (nombre, precio_unitario, stock) " + "VALUES ('" + nombre + "', '" + precio + "', '" + stock + "')";
            stmt.executeUpdate(insertar);

            System.out.println("Articulo añadido correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al añadir Articulo: " + e.getMessage());
        }
    }
    
    public void añadirFactura() {
    	Scanner scanner = new Scanner(System.in);

        new Mostrar().mostrarProveedor();
        System.out.print("\n");
        System.out.print("\nID del provedor de la factura: ");
        String id_proveedor = scanner.nextLine();

        System.out.print("Fecha de la factura (formato AAAA-MM-DD): ");
        String fecha = scanner.nextLine();

        System.out.print("Total: ");
        String total = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java9";  
        String usuario = "root";
        String contrasena = "1234";  

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = conexion.createStatement()) {

            String insertar = "INSERT INTO Facturas_Recibidas (id_proveedor, fecha, total) " + "VALUES ('" + id_proveedor + "', '" + fecha + "', '" + total + "')";
            stmt.executeUpdate(insertar);

            System.out.println("Factura añadida correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al añadir factura: " + e.getMessage());
        }
    }
    
    public void añadirVenta() {
    	Scanner scanner = new Scanner(System.in);
    	
        new Mostrar().mostrarCliente();
        System.out.print("\nID del Cliente de la compra: ");
        String id_cliente = scanner.nextLine();
        
        new Mostrar().mostrarArticulo();
        System.out.print("\nID del Articulo comprado: ");
        String id_articulo = scanner.nextLine();

        System.out.print("Cantidad: ");
        String cantidad = scanner.nextLine();

        System.out.print("Fecha de Venta (formato AAAA-MM-DD): ");
        String fecha_venta = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java9";  
        String usuario = "root";
        String contrasena = "1234";  

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = conexion.createStatement()) {

            String insertar = "INSERT INTO Ventas (id_cliente, id_articulo, cantidad, fecha_venta) " + "VALUES ('" + id_cliente + "', '" + id_articulo + "', '" + cantidad + "', '" + fecha_venta + "')";
            stmt.executeUpdate(insertar);

            System.out.println("Venta añadida correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al añadir venta: " + e.getMessage());
        }
    }
}
