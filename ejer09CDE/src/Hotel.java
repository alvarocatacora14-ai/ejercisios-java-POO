import java.util.ArrayList;
public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;

    // Constructor
    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    // Agregar habitaciones
    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    // 🔍 Buscar disponibles por tipo
    public ArrayList<Habitacion> buscarDisponibles(String tipo) {
        ArrayList<Habitacion> disponibles = new ArrayList<>();

        for (Habitacion h : habitaciones) {
            if (!h.isOcupada() && h.getTipo().equalsIgnoreCase(tipo)) {
                disponibles.add(h);
            }
        }

        return new ArrayList<>(disponibles); // copia defensiva
    }

    // 🛏️ Reservar habitación
    public void reservar(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero && !h.isOcupada()) {
                h.ocupar();
                System.out.println("Habitación reservada: " + numero);
                return;
            }
        }
        System.out.println("No disponible.");
    }

    // ✅ Check-in
    public void checkIn(int numero) {
        reservar(numero); // reutilizamos lógica
    }

    // 🚪 Check-out
    public void checkOut(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero && h.isOcupada()) {
                h.liberar();
                System.out.println("Check-out realizado: " + numero);
                return;
            }
        }
        System.out.println("Habitación no ocupada.");
    }

    // 💰 Calcular factura
    public double calcularFactura(int numero, int noches) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                return h.getPrecioPorNoche() * noches;
            }
        }
        return 0;
    }

    // 📊 Mostrar ocupación
    public void mostrarOcupacion() {
        for (Habitacion h : habitaciones) {
            System.out.println("Habitación " + h.getNumero() +
                    " | Tipo: " + h.getTipo() +
                    " | Ocupada: " + h.isOcupada());
        }
    }
}

