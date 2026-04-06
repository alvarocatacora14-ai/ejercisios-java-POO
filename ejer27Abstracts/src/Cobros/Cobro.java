package Cobros;

public abstract class Cobro {
    protected double monto;
    public Cobro(double monto) {
        this.monto = monto;
    }
    public abstract boolean procesar();
    public abstract double calcularComision();
    public abstract boolean validar();
    /*metodo factory*/
    public static Cobro crear(String tipo, double monto){
        switch (tipo.toLowerCase()) {
            case "RECURRENTE":
                return new CobroRecurrente(monto, 30);
            case "UNICO":
                return new CobroUnico(monto);
            case "DIFERIDO":
                return new CobroDiferido(monto, 12, 0.15);
                default:
                    throw new IllegalArgumentException("TIPO NO VALIDO");
                }
        }
    }

