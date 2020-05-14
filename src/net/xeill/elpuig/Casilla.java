package net.xeill.elpuig;

public class Casilla {

  int numero;

  boolean oca;
  boolean puente;
  boolean pozo;
  boolean calavera; // Conectarla con inicio

  boolean carcel;
  boolean laberinto;
  boolean posada;

  int conectada; // Con cual casilla esta conectada
  int standby; // Numero de turnos que te quedas en standby


  Casilla(int numero, boolean oca, boolean puente, boolean pozo, boolean calavera,
          boolean carcel, boolean laberinto, boolean posada, int conectada, int standby) {

            this.numero = numero;
            this.oca = oca;
            this.puente = puente;
            this.pozo = pozo;
            this.calavera = calavera;
            this.carcel = carcel;
            this.laberinto = laberinto;
            this.posada = posada;
            this.conectada = conectada;
            this.standby = standby;
  }


}
