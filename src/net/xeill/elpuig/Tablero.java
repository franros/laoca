package net.xeill.elpuig;

public class Tablero{

    Casilla[] tablero; // La 0 está vacía

    public Tablero() {
      this.tablero = new Casilla[64];

      // Creación del tablero
      for (int i = 0; i < tablero.length; i++) {

        switch (i) {
          // Casilla 0, vacía
        case 0:
              tablero[i] = new Casilla(i, false, false, false, false, false, false, false, 0, 0);
        break;

          // Es una oca
        case 5:
        case 9:
        case 14:
        case 18:
        case 23:
        case 27:
        case 32:
        case 36:
        case 41:
        case 45:
        case 50:
        case 54:
        case 59:
          tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 0);
          System.out.println("de oca a oca y tiro porque me toca");
        break;

        case 63:
            tablero[i] = new Casilla(i, true, false, false, false, false, false, false, 1, 1);
            //DEBE ESTAR CONECTADA??ULTIMA CASILLA. también es el fin del juego
          //  System.out.println("the winner is: "+ /*jugador*/");
            break;

          // Es un puente

            case 6:
            case 12:
                tablero[i] = new Casilla(i, false, true, false, false, false, false, false, 1, 0);
                System.out.println("de puente a puente y tiras porque se te lleva la corriente!");
            break;//debe retrocer hasta la 6.

            // La posada

            case 19:
                tablero[i] = new Casilla(i, false, false, false, false, false, false, true, 0, 1);
                System.out.println("Welcome to \"La Posada\" descansa dos turnos amigo.");
            break;

             //el pozo

            case 31:
                tablero[i] = new Casilla(i, false, false, true, false, false, false, false, 0, 1);
                System.out.println("Pozo de bronce! Toca esperar.");
            break;

            /* Casilla "los dados": aun por definir
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

            //la muerte

            case 58:
                tablero[i] = new Casilla(i, false, false, false, true, false, false, false, 1, 0);
                System.out.println("Muerte, solo reza por ser de los 2 primeros, o deberás obeceder lo que digan ellos.");
                break;

            //cualquier otra

            default:
            tablero[i] = new Casilla(i, false, false, false, false, false, false, false, 0, 0);

        }

      }

      asignarOcasConectadas();
      asignarPuentesConectadas();
      asignarPosada();
      asignarPozo();
      asignarLaberinto();
      asignarCarcel();
      asignarCasillaDados();
      asignarCalavera();
      asignarJardinlaOca();//necesario?
    }

    public void asignarOcasConectadas() {

        tablero[5].conectada = 9;
        tablero[9].conectada = 14;
        tablero[14].conectada = 18;
        tablero[18].conectada = 23;
        tablero[23].conectada = 27;
        tablero[27].conectada = 32;
        tablero[32].conectada = 36;
        tablero[36].conectada = 41;
        tablero[41].conectada = 45;
        tablero[45].conectada = 50;
        tablero[50].conectada = 54;
        tablero[54].conectada = 59;
        tablero[59].conectada = 63;



    }

    public void asignarPuentesConectadas() {

      tablero[6].conectada = 12;
      tablero[12].conectada = 6;

    }

    public void asignarPosada(){

        //debe esperar 1 turno


    }

    public void asignarPozo(){
        //debe esperar hasta que algun jugador pase por esta casilla!!

    }

    public void asignarLaberinto(){

        tablero[42].conectada = 30;

    }

    public void asignarCarcel(){

        //debe esperar 2 turno


    }

    public void asignarCasillaDados(){

        //se suma la marcación de la casilla de los dados (26 o 53)
        // y se avanza tanto como resulte.
    }

    public void asignarCalavera(){

        tablero[58].conectada= 1;

    }

    public void asignarJardinlaOca(){
        tablero[59].conectada= 63;//fin del juego

    }


}
