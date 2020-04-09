package net.xeill.elpuig;

public class Main {
    public static void main(String[] args) {
        Dado d = new Dado();
        Tablero t = new Tablero();
        Dado dado= new Dado();
        Arbitro arbitro = new Arbitro();
        Menu menu = new Menu();

        String nombre;
        int eleccion;
        int accion;

        String turno = "jugador";

        do {
          /*
          System.out.println("1. Jugar");
          System.out.println("2. Reglas");
          System.out.println("3. Historia del juego");
          System.out.println("4. Salir");
          */
            menu.inicio();
            eleccion = menu.leerInicio();

            switch (eleccion) {
              case 1: // JUGAR

                  // Creamos el jugador
                  menu.nombreJugador();
                  nombre = menu.leerNombreJugador();
                  Jugador jugador = new Jugador(nombre);

                  // Creamos la IA
                  IA ia = new IA();
                  ia.sayHello();

                  boolean findejuego = false;

                  // El bucle del juego empieza aquí:
                  while (!findejuego) {

                    if (turno == "jugador") {
                      menu.accion(jugador);
                      accion = menu.leerAccion(jugador);
                      /*
                      "1. Tirar dados \n" +
                      "2. Ver posición actual \n" +
                      "3. Retirarse");
                      */
                      switch (accion) {
                        case 1:
                        int tirada = Dado.getNumeroAleatorio(1,6);
                        int pj = jugador.getPosicion();
                        int nuevaP = arbitro.calcularNuevaPosicion(t, pj, tirada);

                        arbitro.moverJugador(t, jugador, nuevaP);
                        turno = arbitro.actualizarTurno(t, turno, nuevaP);

                        // Volvemos al bucle y según el turno entraríamos por un sitio o por otro, jugador o ia

                          break;
                        case 2: jugador.verPosicionActual();
                          break;
                        case 3: jugador.retirarse();
                          findejuego = true;
                          break;
                        default:
                          break;
                      }
                    } else if (turno == "IA") {
                      // Aquí tiraría nuestra IA
                      //  arbitro.tiradaIA();
                    } else {
                      // SERIA ERROR
                    }

                  }
                  // El bucle del juego acaba aquí
                  break;

              case 2: // REGLAS
                  menu.reglas();
                  break;
              case 3: // HISTORIA
                  menu.historia();
                  break;
          }

        } while (eleccion != 4); // Mientras no sea salir juego nos mantenemos en el bucle principal

    }
}
