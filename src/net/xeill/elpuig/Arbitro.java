package net.xeill.elpuig;

public class Arbitro {

  // Actualizar el turno teniendo en cuenta la posicion en la que ha caído después de mover
  public String actualizarTurno(Tablero t, String turnoActual, int nuevaPosicion) {
    // Hacer cálculos y retrnar el turno
    // en el caso de oca a Oca
    // CUando vea que la nuevaPosicion en la que he caido es una oca, el turno se queda como está
    return "jugador";
  }

  // Dado un tablero, una posición de inicio (desde) y una tirada (número entre 1 y 6)
  public int calcularNuevaPosicion(Tablero t, int desde, int tirada) {

    // Primero hay que mirar dónde estamos...
    // Si estamos en cárcel pasará una cosa, si estamos en otro tipo pues otra.

    if (t.tablero[desde].oca == true) {

    }



    // Aquí ya sabemos donde caeríamos
    // Donde voy a caer?????
    int nuevaP = desde + tirada;

    // Hay que comprobar que esa nuevaP existe
    // En caso de que exista se puede mirar de qué tipo es

    // Es más grande de 63 ? Habrá que comparar no?
    // NO ->
    if (t.tablero[nuevaP].oca == true) {

    }

    else if (t.tablero[nuevaP].puente == true) {
    //  tablero[nuevaP].conectada
    // debo escribir todo aqui?? o asigno los datos de tablero?
    }
    else  if (t.tablero[nuevaP].posada == true) {

    }
    else if (t.tablero[nuevaP].pozo == true) {

    }
    else if (t.tablero[nuevaP].laberinto == true) {

    }
    else if (t.tablero[nuevaP].carcel == true) {

    }
  //  else if (t.tablero[nuevaP].dados == true) {

//    }
    else if (t.tablero[nuevaP].calavera == true) {

    } else { }


    // Hay que actualizar este return, siempre retorna la casilla 1
    return 1;
  }


  public void moverJugador(Tablero t, Jugador jugador, int nuevaP) {
    // mueve al jugador y actualiza su posición
    jugador.setPosicion(nuevaP);
  }

}
