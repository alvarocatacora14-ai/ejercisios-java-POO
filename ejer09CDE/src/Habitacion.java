public class Habitacion {

    private int numero;
    private String tipo;
    private double precioPorNoche;
    private boolean ocupada;

    // Constructor
    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.ocupada = false;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    // Métodos controlados (encapsulamiento)
    public void ocupar() {
        ocupada = true;
    }

    public void liberar() {
        ocupada = false;
    }
}
