package net.xeill.elpuig;

public class Jugador {
  private int posicion;
  String nombre;

  public Jugador(String nombre) {
    this.nombre = nombre;
    this.posicion = 0;
  }

  public int getPosicion() {
    return this.posicion;
  }

  public void setPosicion(int p) {
    this.posicion = p;
  }

  public void verPosicionActual() {
    System.out.println("La posición actual es: "+this.posicion);
  }

  public void retirarse() {
    System.out.println("Me retiro. ¬¬!");
  }





}
