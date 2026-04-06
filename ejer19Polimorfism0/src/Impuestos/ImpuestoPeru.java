package Impuestos;

public class ImpuestoPeru extends CalcularImpuesos {
    public ImpuestoPeru() {
        super("PERU");
    }

    @Override
    public double calcularImpuesos(double monto) {
        return monto * 0.15;
    }

    @Override
    public String getDescripcion() {
        return "IMPESTO DE PERU (IGV 18%)";
    }
}

