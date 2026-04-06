public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected double consumoKmLitro;

    // Constructor
    public Vehiculo(String marca, String modelo, int capacidad, double consumoKmLitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.consumoKmLitro = consumoKmLitro;
    }

    // Método para calcular costo de viaje
    public double costoViaje(double km, double precioLitro) {
        return (km / consumoKmLitro) * precioLitro;
    }

    // Método descripción
    public String descripcion() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Capacidad: " + capacidad +
                ", Consumo: " + consumoKmLitro + " km/l";
    }

    // Getter capacidad
    public int getCapacidad() {
        return capacidad;
    }
}
