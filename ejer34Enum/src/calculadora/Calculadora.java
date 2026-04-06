package calculadora;

public class Calculadora {
    public double operar(double a, double b, Operacion operacion) {
        return operacion.calcular(a, b);
    }
}
