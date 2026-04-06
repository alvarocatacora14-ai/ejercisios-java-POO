package Cobros;

public class CobroUnico extends Cobro{
public CobroUnico(String monto){
    super(monto);
}
@Override
public boolean validar(){
    return monto>0;
}
@Override
    public boolean procesar(){
    if(validar()){
        System.out.println("PROCESANDO COBRO UNICO");
        return true;
    }
    return false;
}
@Override
    public double calcularComision(){
    return monto*0.02;
}
}
