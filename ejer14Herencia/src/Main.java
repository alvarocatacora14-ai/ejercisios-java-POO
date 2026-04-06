public class Main {
    public static void main(String[] args) {

        Flota flota = new Flota();

        Automovil auto = new Automovil("Toyota", "Corolla", 5, 15, 4);
        Autobus bus = new Autobus("Volvo", "X1", 2, 5);
        Motocicleta moto = new Motocicleta("Honda", "CBR", 30, 250);

        flota.agregarVehiculo(auto);
        flota.agregarVehiculo(bus);
        flota.agregarVehiculo(moto);

        flota.mostrarVehiculos();

        System.out.println("Capacidad total: " + flota.capacidadTotal());

        double costo = auto.costoViaje(100, 5.5);
        System.out.println("Costo viaje auto: " + costo);
    }
}