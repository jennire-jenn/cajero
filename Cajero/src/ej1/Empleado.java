package ej1;

public class Empleado extends Usuario{
 private String puesto;

public Empleado(String nombre, int pin, String rol, String dni, String puesto) {
	super(nombre, pin, rol, dni);
	this.puesto = puesto;
}
	
}
