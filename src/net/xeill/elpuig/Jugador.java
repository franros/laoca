package net.xeill.elpuig;

public class Jugador {
	private int posicion;
	String nombre;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.posicion = 0;
	}

	public Jugador() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int p) {
		this.posicion = p;
	}

	public void verPosicionActual() {
		System.out.println("La posicion actual es: " + this.posicion+"\n");
	}

	public String toString() {
		return nombre + "|" + posicion;
	}

	public void retirarse() {
		System.out.println("Me retiro.¬¬!" + "\n");
	}

}
