import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jugador="";
        int eleccion, eleccion2;
        int position=0;
        Dado d = new Dado();



            System.out.println("DAMAS (Produced by Jeremy and Fran)");
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

            if(eleccion !=3) {
                switch (eleccion) {
                    case 1:
                        System.out.println("vamos a jugar. Como te llamas?");
                        Scanner sc = new Scanner(System.in);
                        jugador=sc.nextLine();
                        System.out.println("Que deseas hacer "+jugador+"? \n"+
                                "1.Tirar dados \n" +
                                "2.Ver posicion actual \n"+
                                "3.Retirarse");

                        eleccion2=input.nextInt();
                             switch (eleccion2) {
                                 case 1:
                                     d.tirarDado();//fallo
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
                        System.out.println("historia?");
                        break;
                }

            }

    }
}
