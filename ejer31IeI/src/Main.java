
package delivery;

public class Main {
    public static void main(String[] args) {

        Repartidor r = new Repartidor("Juan", "Lima Centro", "Disponible", "juan@email.com");

        r.calificar(5);
        r.calificar(4);

        System.out.println("Promedio: " + r.getpromedio());

        r.notificar("Tienes un nuevo pedido");
    }
}