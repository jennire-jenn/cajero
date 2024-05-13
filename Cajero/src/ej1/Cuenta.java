package ej1;

public class Cuenta {
private String operaciones;
private double Saldo;
private Cliente cliente;
private int nrocuenta;
public Cuenta(String operaciones, double saldo, Cliente cliente, int nrocuenta) {
	super();
	this.operaciones = operaciones;
	Saldo = saldo;
	this.cliente = cliente;
	this.nrocuenta = nrocuenta;
}
public String getOperaciones() {
	return operaciones;
}
public void setOperaciones(String operaciones) {
	this.operaciones = operaciones;
}
public double getSaldo() {
	return Saldo;
}
public void setSaldo(double saldo) {
	Saldo = saldo;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public int getNrocuenta() {
	return nrocuenta;
}
public void setNrocuenta(int nrocuenta) {
	this.nrocuenta = nrocuenta;
}

}
