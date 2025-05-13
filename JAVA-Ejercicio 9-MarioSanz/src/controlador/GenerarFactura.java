package controlador;

import modelo.Factura;

public class GenerarFactura {
	public void generarFactura(){
		new Factura().generar();
	}
}
