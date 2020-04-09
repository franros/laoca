package net.xeill.elpuig;

public class Tablero{

    Casilla[] tablero; // La 0 está vacía

    public Tablero() {
      this.tablero = new Casilla[64];


      for (int i = 0; i < tablero.length; i++) {

        switch (i) {
          // Casilla 0, vacía
          case 0:
              tablero[i] = new Casilla(i, false, false, false, false, false, false, false, 0, 0);
            break;
          // Es una oca
        case 1:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 5:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 9:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 14:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 18:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 23:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 27:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 32:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 36:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 41:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 45:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 50:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 54:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 59:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
            System.out.println("de oca a oca y tiro porque me toca");
        break;
        case 63:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 1);
            //DEBE ESTAR CONECTADA??ULTIMA CASILLA. también es el fin del juego
            System.out.println("the winner is: "+ /*jugador*/");
            break;


          // Es un puente
            case 6:
                tablero[i] = new Casilla(i, false, true, false, false, false, false, false, 1, 0);
                System.out.println("de puente a puente y tiras porque se te lleva la corriente!");
            break;

            case 12:
                tablero[i] = new Casilla(i, false, true, false, false, false, false, false, 1, 0);
                System.out.println("de puente a puente y tiras porque se te lleva la corriente!");
            break;//debe retrocer hasta la 6.

            // La posada

            case 19:
                tablero[i] = new Casilla(i, false, false, false, false, false, false, true, 0, 1);
                System.out.println("Welcome to ""La Posada"" descansa dos turnos amigo.");
            break;

             //el pozo
            case 31:
                tablero[i] = new Casilla(i, false, false, true, false, false, false, false, 0, 1);
                System.out.println("Pozo de bronce! Toca esperar.");
            break;

            /* los dados: aun por definir
            si se cae en estas casillas debemos de volver a tirar.
            case 26:
                tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 0, 0);
                System.out.println( "De dado a dado y tiro porque me ha tocado");
                break;
            case 53:
                tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 0, 0);
                System.out.println( "De dado a dado y tiro porque me ha tocado");
            break;

            */
            // el laberinto
            case 42:
                tablero[i] = new Casilla(i, false, false, false, false, false, true, false, 1, 0);
            //debe retroceder a la casilla 30
                System.out.println("del laberinto al 30");
                break;

             //la cárcel
            case 52:
                tablero[i] = new Casilla(i, false, false, false, false, true, false, false, 0, 1);
                System.out.println("Vas a perder 3 turnos, recapacita por ello chic@!");
            break;
            case 58:
                tablero[i] = new Casilla(i, false, false, false, true, false, false, false, 1, 0);
                System.out.println("Muerte, solo reza por ser de los 2 primeros, o deberás obeceder lo que digan ellos.");
                break;
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
