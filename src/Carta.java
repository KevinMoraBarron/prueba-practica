public class Carta {
    // Atributos
    private int valor;
    private String palo;

    // Constructor
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Métodos para obtener el valor y el palo de la carta
    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    // Método para representar la carta como una cadena de texto
    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
