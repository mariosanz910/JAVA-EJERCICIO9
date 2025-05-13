package modelo;

import java.sql.*;
import java.util.Scanner;

public class Eliminar {
	public void eliminarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del cliente a eliminar: ");
        int idCliente = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            String eliminar = "DELETE FROM Clientes WHERE id_cliente = " + idCliente;
            stmt.executeUpdate(eliminar);

            System.out.println("Cliente eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }
	
	public void eliminarProveedor() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del proveedor a eliminar: ");
        int idProveedor = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            String eliminar = "DELETE FROM Proveedores WHERE id_proveedor = " + idProveedor;
            stmt.executeUpdate(eliminar);

            System.out.println("Proveedor eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar proveedor: " + e.getMessage());
        }
	}
	
	public void eliminarArticulo() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del articulo a eliminar: ");
        int idArticulo = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            String eliminar = "DELETE FROM Articulos WHERE id_articulo = " + idArticulo;
            stmt.executeUpdate(eliminar);

            System.out.println("Articulo eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar articulo: " + e.getMessage());
        }
	}
	
	public void eliminarFactura() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID de la factura a eliminar: ");
        int idFactura = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            String eliminar = "DELETE FROM Facturas_Recibidas WHERE id_factura = " + idFactura;
            stmt.executeUpdate(eliminar);

            System.out.println("Factura eliminada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar la factura: " + e.getMessage());
        }
	}
	
	public void eliminarVenta() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID de la venta a eliminar: ");
        int idVenta = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {

            String eliminar = "DELETE FROM Ventas WHERE id_venta = " + idVenta;
            stmt.executeUpdate(eliminar);

            System.out.println("Venta eliminada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar la venta: " + e.getMessage());
        }
	}
}
