public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Java");

        // Crear habitaciones
        hotel.agregarHabitacion(new Habitacion(101, "Simple", 100));
        hotel.agregarHabitacion(new Habitacion(102, "Doble", 150));
        hotel.agregarHabitacion(new Habitacion(103, "Simple", 100));

        // Buscar disponibles
        System.out.println("Habitaciones simples disponibles: "
                + hotel.buscarDisponibles("Simple").size());

        // Reservar y check-in
        hotel.checkIn(101);

        // Mostrar ocupación
        hotel.mostrarOcupacion();

        // Calcular factura
        double total = hotel.calcularFactura(101, 3);
        System.out.println("Total a pagar: " + total);

        // Check-out
        hotel.checkOut(101);
    }
}