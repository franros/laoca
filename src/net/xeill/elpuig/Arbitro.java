package net.xeill.elpuig;


public class Arbitro {

  // Actualizar el turno teniendo en cuenta la posicion en la que ha caido despues de mover
  
	public String actualizarTurno(Tablero t, String turnoActual, int nuevaPosicion) {
    // Hacer calculos y retornar el turno
    // en el caso de Oca a Oca
    // Cuando vea que la nuevaPosicion en la que ha caido es una oca, el turno se queda como esta
	  
    if (turnoActual.equals("jugador")){
        if (t.tablero[nuevaPosicion].oca ==true){
            return "jugador"; 
        }
        else{
            return "IA"; 
        }
        
    }
    else{
         if (t.tablero[nuevaPosicion].oca ==true){
             return "IA"; 
         }
         else{
             return "jugador"; 
         }
    }
  }
  
  public int actualizarSinTirar(Tablero t, String turnoActual, int nuevaPosicion) {
	  
	  // Mira a ver en que casos el jugador se queda sin tirar si ha caido en alguna 
	    // casilla en la que no puede tirar, por ejemplo posada.
	
	  int turno = 0;
	    if (turnoActual.equals("jugador")){
	        if (t.tablero[nuevaPosicion].posada == true){
	            return turno = 1; 
	        }
	        else if (t.tablero[nuevaPosicion].carcel == true){
	            return turno = 2; 
	        }
	        
	    }
	    else{
	        if (t.tablero[nuevaPosicion].posada == true){
	            return turno = 1; 
	        }
	        else if (t.tablero[nuevaPosicion].carcel == true){
	            return turno = 2; 
	        }
	    }
		return turno;
	  }

  // Dado un tablero, una posicion de inicio (desde) y una tirada (numero entre 1 y 6)
  
  public int calcularNuevaPosicion(Tablero t, int desde, int tirada, Jugador j1, Jugador j2) {

    // Primero hay que mirar donde estamos...
    // Si estamos en carcel pasara una cosa, si estamos en otro tipo pues otra.
	
	int nuevaP = desde + tirada;
    if (nuevaP < 63) {
		if (t.tablero[nuevaP].oca == true) {
			System.out.println("De oca en oca y tiro porque me toca \n");
		} else if (t.tablero[nuevaP].pozo == true) {
			System.out.println("No volverás a tirar hasta que el oponente te rescate del pozo!");
		} else if (t.tablero[nuevaP].carcel == true) {
			System.out.println("Has caido en la cárcel 2 turnos sin tirar!!!");

		}

		else if (t.tablero[nuevaP].puente == true) {
			System.out.println("Has caido en el puente, vas a la posada, posición 19 y un turno sin tirar");
			nuevaP = 19;

		} else if (t.tablero[nuevaP].posada == true) {
			System.out.println("Welcome to \"La Posada\" descansa dos turnos amigo.");
		}

		else if (t.tablero[nuevaP].pozo == true) {
			System.out.println("Pozo de bronce! Toca esperar.");

		} else if (t.tablero[nuevaP].laberinto == true) {
			System.out.println("LABERINTO vuelves a la casilla 30");
			nuevaP = 30;

		} else if (t.tablero[nuevaP].calavera == true) {
			System.out.println("Has caido en la calavera, pero ten paciencia, la muerte desespera!!!"+"\n"+"Vuelve a la casilla 0");
			nuevaP = 1;
		} 
	} else {
		if(j1.getPosicion() > 63) {
			System.out.println(Main.jugador.getNombre() +" HAS GANADO!");
		} else {
			System.out.println(Main.IA.getNombre() +" HAS GANADO!");
		}
		nuevaP = 63;
		// para que finalice el juego usamos el .exit
		
		System.exit(0);
	}
	     



    // Aqui ya sabemos donde caeremos
    // Donde voy a caer?????
    

    // Hay que comprobar que esa nuevaP existe
    // En caso de que exista se puede mirar de que tipo es

    // Es mas grande de 63 ? Habra que comparar no?

    // Hay que actualizar este return, siempre retorna la casilla 1

    return nuevaP;
  }


  public void moverJugador(Tablero t, Jugador jugador, int nuevaP) {
	  
    // mueve al jugador y actualiza su posicion
	  
    jugador.setPosicion(nuevaP);
  }
  
// carcel boleano

    void moverJugador(Tablero t, int IA, int nuevaP) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
