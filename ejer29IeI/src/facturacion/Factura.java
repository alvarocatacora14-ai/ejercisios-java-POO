package facturacion;

public class Factura implements Pagable, Imprimible, Exportable {
    private double monto;

    public Factura(double monto) {
        this.monto = monto;
    }
    /*PAGABLE*/
    @Override
    public double calcularMonto() {
        return monto;
    }
    @Override
    public boolean procesarPago(){
        System.out.println("PAGO PROCESADO POR: "+monto);
        return true;
    }
    /*IMPRIMIBLE*/
    @Override
    public void imprimir() {
        System.out.println(formatear());
    }
    @Override
    public String formatear() {
        return "FACTURA POR MONTO: "+monto;
    }
    /*EXPortBLE*/
    @Override
    public String exportar() {
        return "FACTURA EXPORTADA EN PDF";
    }
    @Override
    public String getformato() {
        return "PDF";
    }
}
