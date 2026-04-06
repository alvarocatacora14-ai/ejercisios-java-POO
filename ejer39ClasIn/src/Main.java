package builder;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido.Builder()
                .cliente("Ana García")
                .producto("Laptop HP")
                .cantidad(2)
                .descuento(0.10)
                .direccion("Lima, Perú")
                .notas("Entregar en horario de oficina")
                .build();

        System.out.println(pedido);
    }
}