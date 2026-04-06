package Cobros;

public class CobroRecurrente extends Cobro{
    private int periodicidad;
    public CobroRecurrente(double monto, int periodicidad){
        super(monto);
        this.periodicidad = periodicidad;
    }
    @Override
    public boolean validar(){
        return monto>0;
    }
    @Override
    public void procesar(){
        if(validar()){
            System.out.println("PROCESANDO COBRO RECURRENTE");
            return true;
        }
        return false;
    }
    @Override
    public double calcularComision(){
        return monto*0.05;
    }
}
