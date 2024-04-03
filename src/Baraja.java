import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    // Atributo
    private List<Carta> cartas;

    // Constructor
    public Baraja() {
        cartas = new ArrayList<>();
        // Inicializar la baraja
        for (int valor = 1; valor <= 12; valor++) {
            for (String palo : new String[]{"bastos", "copas", "espadas", "oros"}) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    // Método para barajar la baraja
    public void barajar() {
        Collections.shuffle(cartas);
    }

    // Método para repartir una carta de la baraja
    public Carta repartirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            return null; // Si la baraja está vacía, devolvemos null
        }
    }

    // Método para obtener la cantidad de cartas restantes en la baraja
    public int cartasRestantes() {
        return cartas.size();
    }
}
