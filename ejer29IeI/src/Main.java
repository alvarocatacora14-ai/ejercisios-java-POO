package facturacion;

public class Main {
    public static void main(String[] args) {

        Factura f = new Factura(150);

        // Polimorfismo con interfaces
        Pagable p = f;
        Imprimible i = f;
        Exportable e = f;

        System.out.println("Monto: " + p.calcularMonto());
        p.procesarPago();

        i.imprimir();

        System.out.println(e.exportar());
        System.out.println("Formato: " + e.getformato() );
    }
}
