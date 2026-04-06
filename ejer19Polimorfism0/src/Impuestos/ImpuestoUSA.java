package Impuestos;

public class ImpuestoUSA extends CalcularImpuesos{
    private double tasa;
    public ImpuestoUSA(double tasa){
        super("USA");
        this.tasa = tasa;
    }
    @Override
    public double calcularImpuesos(double monto){
        return monto*tasa;
    }
    @Override
    public String getDescripcion() {
        return "IMPUESTO DE USA (SALE TAX VARIABLE: "+(tasa*100)+"%";
    }
}
