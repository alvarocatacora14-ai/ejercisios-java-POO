//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Impuestos.CalcularImpuesos;
import Impuestos.ImpuestoEspaña;
import Impuestos.ImpuestoMexico;
import Impuestos.ImpuestoUSA;

import java.util.ArrayList;
public class  Main {
    public static void main(String[] args) {

        ArrayList<CalcularImpuesos> calculadoras = new ArrayList<>();

        calculadoras.add(new ImpuestoMexico());
        calculadoras.add(new ImpuestoEspaña());
        calculadoras.add(new ImpuestoUSA(0.7)); // 7% ejemplo

        double monto = 1000;

        for (CalcularImpuesos c : calculadoras) {
            System.out.println(c.getDescripcion());
            System.out.println("Impuesto: " + c.calcularImpuesos(monto));
            System.out.println("----------------------");
        }
    }
    }

