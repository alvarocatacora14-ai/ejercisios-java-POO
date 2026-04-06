
class Autobus extends Vehiculo {
    private int pisos;

    public Autobus(String marca, String modelo, int pisos, double consumoKmLitro) {
        super(marca, modelo, pisos * 40, consumoKmLitro); // capacidad automática
        this.pisos = pisos;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Pisos: " + pisos;
    }
}