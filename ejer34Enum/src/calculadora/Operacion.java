package calculadora;

public enum Operacion {
    SUMA("+") {
        @Override
        public double calcular(double a, double b){
            return a + b;
        }
    },
    RESTA("-"){
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACION("*"){
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },
    DIVISION("/"){
        @Override
        public double calcular(double a, double b){
            if(b == 0) throw  new ArithmeticException("DIVISION POR 0CERO");
            return a / b;
        }
    };
    private String simbolo;

    Operacion(String simbolo) {
        this.simbolo = simbolo;
    }
    public abstract double calcular(double a, double b);
    public String getSimbolo() {
        return simbolo;
    }
}
