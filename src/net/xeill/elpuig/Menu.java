package net.xeill.elpuig;

import java.util.Scanner;

public class Menu {

  // Este es el scanner para toda la clase
  Scanner scanner = new Scanner(System.in);

  // Borra la pnatalla
  public void cls() {
    System.out.print("\033\143");
  }

  public void inicio() {
    System.out.println("La oca (Produced by Jeremy and Fran)");
    System.out.println();
    System.out.println("Menú de inicio");
    System.out.println();
    System.out.println("1. Jugar");
    System.out.println("2. Reglas");
    System.out.println("3. Historia del juego");
    System.out.println("4. Salir");
    System.out.println();
    System.out.println("Elija una opción");
  }

  public int leerInicio() {
   String soption;
   int option;
   try {
     soption = scanner.nextLine();
     option = Integer.parseInt(soption);
   } catch (Exception e) {
     // Si ha fallado porque ha introducido un valor que no es entero
     // Se borra la pantalla
     cls();
     // Se imprime el menú de inicio
     inicio();
     // Se vuelve a llamar para capturar a sí misma para intentar leer el entero
     return leerInicio();
   }

   // Comprobación adicional:
   // Si no es ninguna de las respuestas esperadas, nos volvemos a llamar
   if (option != 1 && option != 2 && option != 3 && option != 4) return leerInicio();

   // Si hemos llegado hasta aquí es que la option era correcta
   return option;
 }

 public void nombreJugador() {
   System.out.println("Vamos a jugar. Cómo te llamas?");
 }

 public String leerNombreJugador() {
   String soption;
   try {
     soption = scanner.nextLine();
    } catch (Exception e) {
      // Si ha fallado porque ha introducido un valor que no es entero
      // Se borra la pantalla
      cls();
      // Se imprime el menú de nombreJugador
      nombreJugador();
      // Se vuelve a llamar para capturar a sí misma para intentar leer el nombre
      return leerNombreJugador();
    }
    return soption;
  }

  public void reglas() {
    System.out.println("\n" +
            "    Oca: Casillas 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54 y 59. Si se cae en una de estas casillas, se puede avanzar hasta la siguiente casilla en la que hay una oca y volver a tirar.\n" +
            "    Puente: Casilla 6 y 12. Si se cae en estas casillas se salta a la casilla 19 (la Posada) y se pierde un turno. En algunos tableros, solo figura como puente la casilla 6.\n" +
            "    Posada: Casilla 19. Si se cae en esta casilla se pierde un turno.\n" +
            "    Pozo: Casilla 31. Si se cae en esta casilla, NO se puede volver a jugar hasta que no pase otro jugador por esa casilla.\n" +
            "    Laberinto: Casilla 42. Si se cae en esta casilla, se está obligado a retroceder a la casilla 30.\n" +
            "    Cárcel: Casilla 56. Si se cae en esta casilla, hay que permanecer dos turnos sin jugar.\n" +
            "    Dados: Casillas 26 y 53. Si se cae en estas casillas, se suma la marcación de la casilla de los dados (26 o 53) y se avanza tanto como resulte.\n" +
            "    Calavera: Casilla 58. Si se cae en esta casilla, hay que volver a la Casilla 1.\n" +
            "    Entrar al Jardín de la Oca: Es necesario sacar los puntos justos para entrar, en caso de exceso se retroceden tantas casillas como puntos sobrantes.\n");
  }

  public void historia() {
    System.out.println("Gracias por participar");
  }

  public void accion(Jugador jugador) {
    System.out.println("Que deseas hacer " + jugador.nombre + "? \n" +
            "1. Tirar dados \n" +
            "2. Ver posición actual \n" +
            "3. Retirarse");
  }

  public int leerAccion(Jugador jugador) {
   String soption;
   int option;
   try {
     soption = scanner.nextLine();
     option = Integer.parseInt(soption);
   } catch (Exception e) {
     // Si ha fallado porque ha introducido un valor que no es entero
     // Se borra la pantalla
     cls();
     // Se imprime el menú de accion
     accion(jugador);
     // Se vuelve a llamar para capturar a sí misma para intentar leer el entero
     return leerAccion(jugador);
   }

   // Comprobación adicional:
   // Si no es ninguna de las respuestas esperadas, nos volvemos a llamar
   if (option != 1 && option != 2 && option != 3) return leerAccion(jugador);

   // Si hemos llegado hasta aquí es que la option era correcta
   return option;
 }


}
