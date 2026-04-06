
package impuestos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CalculadoraImpuesto> calculadoras = new ArrayList<>();

        calculadoras.add(new ImpuestoMexico());
        calculadoras.add(new ImpuestoEspana());
        calculadoras.add(new ImpuestoUSA(0.07)); // 7% ejemplo

        double monto = 1000;

        for (CalculadoraImpuesto c : calculadoras) {
            System.out.println(c.getDescripcion());
            System.out.println("Impuesto: " + c.calcularImpuesto(monto));
            System.out.println("----------------------");
        }
    }
}