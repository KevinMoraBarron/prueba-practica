import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar jugadores y mesa
        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");
        Mesa mesa = new Mesa();
        Baraja baraja = new Baraja();
        baraja.barajar();

        // Repartir cartas a los jugadores
        for (int i = 0; i < 5; i++) {
            jugador1.recibirCarta(baraja.repartirCarta());
            jugador2.recibirCarta(baraja.repartirCarta());
        }

        // Mostrar las manos de los jugadores
        System.out.println("Mano del " + jugador1.getNombre() + ": " + jugador1.getMano());
        System.out.println("Mano del " + jugador2.getNombre() + ": " + jugador2.getMano());

        // Lógica del juego aquí
        // Por ejemplo, turnos de los jugadores, jugadas en la mesa, etc.
    }
}
