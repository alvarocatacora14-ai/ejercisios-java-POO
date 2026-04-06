package Impuestos;

public class CalcularImpuesos {
    protected String pais;
    public CalcularImpuesos(String pais) {
        this.pais = pais;
    }
    public double calcularImpuesos(double monto) {
        return 0;
    }
    public String getDescripcion(){
        return "PAIS: "+pais;
    }
}
