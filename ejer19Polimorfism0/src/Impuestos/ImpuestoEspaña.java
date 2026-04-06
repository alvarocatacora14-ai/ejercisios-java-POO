package Impuestos;

public class ImpuestoEspaña extends CalcularImpuesos{
    public ImpuestoEspaña(){
        super("ESPAÑA");
    }
    @Override
    public double calcularImpuesos(double monto) {
        return monto*0.21;
    }
    @Override
    public String getDescripcion() {
        return "IMPUESTO DE ESPAÑA (IVA 21%)";
    }
}
