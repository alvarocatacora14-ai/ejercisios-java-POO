import java.util.ArrayList;

class Flota {
    private ArrayList<Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    // Capacidad total de toda la flota
    public int capacidadTotal() {
        int total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getCapacidad();
        }
        return total;
    }

    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.descripcion());
        }
    }
}
