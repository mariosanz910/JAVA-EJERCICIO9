package modelo;

import java.sql.*;

public class Mostrar {
	public void mostrarCliente() {
		String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT * FROM Clientes";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID: " + idCliente + " | Nombre: " + nombre + " | Email: " + email + " | Teléfono: " + telefono);
                System.out.println("--------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar clientes: " + e.getMessage());
        }
    }
	public void mostrarProveedor() {
		String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT * FROM Proveedores";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idProveedor = rs.getInt("id_proveedor");
                String nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                String telefono = rs.getString("telefono");

                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID: " + idProveedor + " | Nombre: " + nombre + " | Cif: " + cif + " | Teléfono: " + telefono);
                System.out.println("--------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar Proveedores: " + e.getMessage());
        }
	}
	
	public void mostrarArticulo() {
		String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT * FROM Articulos";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idarticulo = rs.getInt("id_articulo");
                String nombre = rs.getString("nombre");
                String precio = rs.getString("precio_unitario");
                String stock = rs.getString("stock");

                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID: " + idarticulo + " | Nombre: " + nombre + " | Precio por unidad: " + precio + " | Stock: " + stock);
                System.out.println("--------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar Articulos: " + e.getMessage());
        }
	}
	
	public void mostrarFacturas() {
		String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT * FROM Facturas_Recibidas";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idfactura = rs.getInt("id_factura");
                String id_proveedor = rs.getString("id_proveedor");
                String fecha = rs.getString("fecha");
                String total = rs.getString("total");

                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID: " + idfactura + " | Id del proveedor: " + id_proveedor + " | Fecha de la factura: " + fecha + " | Total de la factura: " + total);
                System.out.println("--------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar factura: " + e.getMessage());
        }
	}
	
	public void mostrarVenta() {
		String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT * FROM Ventas";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idventa = rs.getInt("id_venta");
                String id_cliente = rs.getString("id_cliente");
                String id_articulo = rs.getString("id_articulo");
                String cantidad = rs.getString("cantidad");
                String fecha_venta = rs.getString("fecha_venta");

                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID: " + idventa + " | Id del cliente: " + id_cliente + " | Id del articulo: " + id_articulo + " | Cantidad: " + cantidad + " | Fecha de la venta: " + fecha_venta);
                System.out.println("--------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar la venta: " + e.getMessage());
        }
	}
}
