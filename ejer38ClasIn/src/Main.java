package inventario;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("Laptop", 5));
        inventario.agregarProducto(new Producto("Mouse", 0));
        inventario.agregarProducto(new Producto("Teclado", 3));
        inventario.agregarProducto(new Producto("Monitor", 0));

        for (Producto p : inventario) {
            System.out.println(p);
        }
    }
}