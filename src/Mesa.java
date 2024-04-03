import java.util.ArrayList;
import java.util.List;

public class Mesa {
    // Atributo
    private List<Carta> cartasJugadas;

    // Constructor
    public Mesa() {
        cartasJugadas = new ArrayList<>();
    }

    // Método para jugar una carta en la mesa
    public void jugarCarta(Carta carta) {
        cartasJugadas.add(carta);
    }

    // Método para obtener las cartas jugadas en la mesa
    public List<Carta> getCartasJugadas() {
        return cartasJugadas;
    }

    // Método para limpiar las cartas jugadas de la mesa
    public void limpiarCartasJugadas() {
        cartasJugadas.clear();
    }
}
