package builder;

public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;
    private double descuento;
    private String direccion;
    private String notas;

    /*CONSTRUCTOR PRIVADO*/
    private Pedido(Builder builder) {
        this.cliente=builder.cliente;
        this.producto=builder.producto;
        this.cantidad=builder.cantidad;
        this.descuento=builder.descuento;
        this.direccion=builder.direccion;
        this.notas=builder.notas;
    }
    /*CLASE INTERNA STATIC BUILDER*/
    public static class Builder {
        private String cliente;
        private String producto;
        private int cantidad=1;
        private double descuento=0;
        private String direccion;
        private String notas;

        public Builder cliente(String cliente) {
            this.cliente=cliente;
            return this;
        }
        public Builder producto(String producto) {
            this.producto=producto;
            return this;
        }
        public Builder cantidad(int cantidad) {
            this.cantidad=cantidad;
            return this;
        }
        public Builder descuento(double descuento) {
            this.descuento=descuento;
            return this;
        }
        public Builder direccion(String direccion) {
            this.direccion=direccion;
            return this;
        }
        public Builder notas(String notas) {
            this.notas=notas;
            return this;
        }
        public Pedido build() {
            if(cliente==null || producto== null){
                throw new IllegalArgumentException("cliente o producto invalido");
            }
            return new Pedido(this);
        }
    }
    @Override
    public String toString() {
        return "PEDIDO{"+
                "CLIENTE='"+cliente+'\''+
                ", PRODUCTO='"+producto+'\''+
                ", CANTIDAD="+cantidad+
                ", DESCUENTO="+descuento+
                ", DIRECCION='"+direccion+ '\''+
                ", NOTAS"+notas+'\''+
    '}';
    }
}
