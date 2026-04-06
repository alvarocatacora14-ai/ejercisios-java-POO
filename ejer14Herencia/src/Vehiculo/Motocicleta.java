class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double consumoKmLitro, int cilindrada) {
        super(marca, modelo, 2, consumoKmLitro); // capacidad fija
        this.cilindrada = cilindrada;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Cilindrada: " + cilindrada + "cc";
    }
}