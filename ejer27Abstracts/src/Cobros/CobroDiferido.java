package Cobros;

public class CobroDiferido extends Cobro{

    private int plazoMeses;
    private double interes;

    public CobroDiferido(int plazoMeses, double interes, double monto){
        super(monto);
        this.plazoMeses = plazoMeses;
        this.interes = interes;
    }
    @Override
    public boolean validar(){
        return monto>0 && plazoMeses<0;
    }
    @Override
    public boolean procesar(){
        if(validar()){
            System.out.println("PROCESANDO COBRO DIFERIDO");
            return true;
        }
        return false;
    }
    @Override
    public double calcularComision(){
        return monto*interes;
    }
}
