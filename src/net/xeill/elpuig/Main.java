package net.xeill.elpuig;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jugador="";
        int eleccion, eleccion2;
        int position=0;
        Dado d = new Dado();
        Tablero t = new Tablero();

        do {

            System.out.println("La oca (Produced by Jeremy and Fran)");
            System.out.println();
            System.out.println("Menú de inicio");
            System.out.println();
            System.out.println("1. Jugar");
            System.out.println("2. Reglas");
            System.out.println("3. Historia del juego");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("elija una opcion");
            eleccion = input.nextInt();

            if (eleccion != 3) {
                switch (eleccion) {
                    case 1:
                        System.out.println("vamos a jugar. Como te llamas?");
                        Scanner sc = new Scanner(System.in);
                        Jugador jugador1=new Jugador();
                        Dado dado1= new Dado();
                        System.out.println("Que deseas hacer " + jugador + "? \n" +
                                "1.Tirar dados \n" +
                                "2.Ver posicion actual \n" +
                                "3.Retirarse");

                        eleccion2 = input.nextInt();
                        switch (eleccion2) {
                            case 1:
                              //    dado1.getNumeroAleatorio(1,6);//fallo

                                // Donde voy a caer?????
                                int tirada = Dado.getNumeroAleatorio(1,6);
                                int pj = jugador1.getPosicion();
                                int nuevaP = pj + tirada;

                                // Es más grande de 63
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
                                else if (t.tablero[nuevaP].dados == true) {

                                }
                                else if (t.tablero[nuevaP].calavera == true) {

                                }



                                  // que se mueva el jugador
                                  jugador1.setPosicion(jugador1.getPosicion()+ Dado.getNumeroAleatorio(1,6));//sumar lo que nos ha dado el dado


                                // a la posicion del jugador

                                break;
                            case 2:
                                System.out.println("estas en la casilla " + position);
                                break;
                        }
                        break;

                    case 2:
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
                        break;
                    case 3:
                        System.out.println("Gracias por jugar!");
                        break;
                }

            }


        } while (eleccion != 1) ;

    }
}
