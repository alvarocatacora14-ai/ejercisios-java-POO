package Vehiculo;

class Automovil extends Vehiculo {
    private int numPuertas;

    public Automovil(String marca, String modelo, int capacidad, double consumoKmLitro, int numPuertas) {
        super(marca, modelo, capacidad, consumoKmLitro); // llamada al padre
        this.numPuertas = numPuertas;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Puertas: " + numPuertas;
    }
}