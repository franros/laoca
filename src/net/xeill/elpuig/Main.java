package net.xeill.elpuig;


public class Main {
	
	static Jugador jugador = null;
	static IA IA = null;
	
	public static void main(String[] args) {
		Tablero t = new Tablero();
		Arbitro arbitro = new Arbitro();
		Menu menu = new Menu();

		String nombre;
		boolean juegoCargado = false;
		int eleccion;
		int accion;
		int sinTirarIA = 0;
		int sinTirarJg = 0;


		String turno = "jugador";

		do {
			/*
			 * System.out.println("1. Jugar"); System.out.println("2. Reglas");
			 * System.out.println("3. Salir");
			 */
			menu.inicio();
			eleccion = menu.leerInicio();

			switch (eleccion) {
			case 1: // JUGAR

				boolean findejuego = false;
				if (juegoCargado == false) {
					// Creamos al jugador
					menu.nombreJugador();
					nombre = menu.leerNombreJugador();
					jugador = new Jugador(nombre);
					// Creamos la IA
					IA = new IA("Sergi");
					IA.sayHello();
					findejuego = false;
				}

				// El bucle del juego empieza aqui:
				
				while (!findejuego) {

					if (turno == "jugador") {
						menu.accion(jugador);
						accion = menu.leerAccion(jugador);
						/*
						 * "1. Tirar dados \n" + "2. Ver posicion actual. \n" + "3. Retirarse");
						 */
						switch (accion) {
						case 1:
							int tirada = Dado.getNumeroAleatorio(1, 6);
							int posJug = jugador.getPosicion();
							
							if (sinTirarJg == 0) {
								int nuevaP = arbitro.calcularNuevaPosicion(t, posJug, tirada, jugador, IA);
								arbitro.moverJugador(t, jugador, nuevaP);
								turno = arbitro.actualizarTurno(t, turno, nuevaP);
								sinTirarJg = arbitro.actualizarSinTirar(t, turno, nuevaP);
							} else {
								System.out.println("¡No puedes tirar todavía!");
								turno = "IA";
								sinTirarJg = sinTirarJg -1;
							}
										
						
							break;
						case 2:
							jugador.verPosicionActual();
							break;
						case 3:
							jugador.retirarse();
							findejuego = true;
							break;
						default:
							break;
						}
					} else if (turno == "IA") {
						int tirada = Dado.getNumeroAleatorio(1, 6);
						int posIA = IA.getPosicion();
						if (sinTirarIA == 0) {
							System.out.println("Turno de la IA");
							int nuevaP = arbitro.calcularNuevaPosicion(t, posIA, tirada, jugador, IA);
							System.out.println("Posición:" + nuevaP + "\n");
							arbitro.moverJugador(t, IA, nuevaP);
							turno = arbitro.actualizarTurno(t, turno, nuevaP);
							sinTirarIA = arbitro.actualizarSinTirar(t, turno, nuevaP);
						} else {
							System.out.println("¡La IA no puede tirar todavía!");
							turno = "jugador";
							sinTirarIA = sinTirarIA -1;
						}


					} else {
						// SERIA ERROR
					}

				}
				// El bucle del juego acaba aqui
				break;

			case 2: // REGLAS
				menu.reglas();
				break;
			case 3: // GUARDAR
				if (jugador != null || IA != null) {
					menu.guardar(jugador, IA);
				} else {
					System.out.println("No se puede guardar porque no hay partida iniciada");
				}
				
				break;
			case 4: // CARGAR
				juegoCargado = menu.cargar();
				break;
			}

		} while (eleccion != 3); // Mientras no sea salir juego nos mantenemos en el bucle principal

	}
}
