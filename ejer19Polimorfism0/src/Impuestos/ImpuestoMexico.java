package Impuestos;

public class ImpuestoMexico extends CalcularImpuesos {
    public ImpuestoMexico() {
        super("MEXICO");
    }
    @Override
    public double calcularImpuesos(double monto){
        return monto *0.16;
    }
    @Override
    public String getDescripcion(){
        return "IMPUESTO DE MEXICO(IVA 16%)";
    }
}
