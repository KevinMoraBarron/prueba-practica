import java.util.ArrayList;
import java.util.List;

public class Jugador {
    // Atributos
    private String nombre;
    private List<Carta> mano;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList<>();
    }

    // Método para recibir una carta en la mano del jugador
    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    // Método para obtener la mano del jugador
    public List<Carta> getMano() {
        return mano;
    }

    // Método para calcular el total de puntos en la mano del jugador
    public double calcularPuntos() {
        double totalPuntos = 0;
        for (Carta carta : mano) {
            totalPuntos += carta.getValor();
        }
        return totalPuntos;
    }

    // Método para limpiar la mano del jugador después de una ronda
    public void limpiarMano() {
        mano.clear();
    }

    public String getNombre() {

        return null;
    }
}
