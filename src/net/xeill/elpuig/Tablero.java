package net.xeill.elpuig;

public class Tablero{

    Casilla[] tablero; // La 0 está vacía

    public Tablero() {
      this.tablero = new Casilla[64];


      for (int i = 0; i < tablero.length; i++) {

        switch (i) {
          // Casilla 0, vacía
          case 0: tablero[i] = new Casilla(i, false, false, false, false, false, false, false, 0, 0);
            break;
          // Es una oca
          case 5:
          case 9:
          case 14: // etc...
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 0, 0);
            break;

          // Es un puente
          default:
            tablero[i] = new Casilla(i, false, false, false, false, false, false, false, 0, 0);

        }

      }

      asignarOcasConectadas();
      asignarPuentesConectadas();
    }

    public void asignarOcasConectadas() {

      tablero[5].conectada = 9;
      tablero[9].conectada = 14;


    }

    public void asignarPuentesConectadas() {

      tablero[6].conectada = 12;
      tablero[12].conectada = 6;


    }





}
