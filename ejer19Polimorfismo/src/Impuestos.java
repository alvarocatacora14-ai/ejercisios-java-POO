public class Impuestos {
    public class CalculadoraImpuestos {
        protected String pais;
        public CalculadoraImpuestos(String pais) {
            this.pais = pais;
        }
        public double calcularImpuestos(double monto) {
            return 0;
        }
        public String getDescripcion() {
            return "PAIS: " +pais;
        }
    }
}
