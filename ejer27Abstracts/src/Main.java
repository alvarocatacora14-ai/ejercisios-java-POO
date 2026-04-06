
package Cobros;

public class Main {
    public static void main(String[] args) {

        Cobro c1 = Cobro.crear("recurrente", 100);
        Cobro c2 = Cobro.crear("unico", 200);
        Cobro c3 = Cobro.crear("diferido", 500);

        c1.procesar();
        System.out.println("Comisión: " + c1.calcularComision());

        c2.procesar();
        System.out.println("Comisión: " + c2.calcularComision());

        c3.procesar();
        System.out.println("Comisión: " + c3.calcularComision());
    }
}