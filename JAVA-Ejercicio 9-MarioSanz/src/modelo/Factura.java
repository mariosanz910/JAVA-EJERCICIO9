package modelo;

import java.sql.*;

public class Factura {
    public void generar() {
        String url = "jdbc:mysql://localhost:3306/java9";
        String usuario = "root";
        String contraseña = "1234";

        String consulta = "SELECT c.nombre AS nombre_cliente, a.nombre AS articulo_comprado, " +
                          "v.cantidad, v.fecha_venta, (a.precio_unitario * v.cantidad) AS total_gastado " +
                          "FROM Ventas v " +
                          "JOIN Clientes c ON v.id_cliente = c.id_cliente " +
                          "JOIN Articulos a ON v.id_articulo = a.id_articulo";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                String nombreCliente = rs.getString("nombre_cliente");
                String articulo = rs.getString("articulo_comprado");
                int cantidad = rs.getInt("cantidad");
                Date fecha = rs.getDate("fecha_venta");
                double total = rs.getDouble("total_gastado");

                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Cliente: " + nombreCliente + " | Artículo: " + articulo + " | Cantidad: " + cantidad +
                                   " | Fecha: " + fecha + " | Total gastado: " + total + " €");
                System.out.println("------------------------------------------------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al generar factura: " + e.getMessage());
        }
    }
}
