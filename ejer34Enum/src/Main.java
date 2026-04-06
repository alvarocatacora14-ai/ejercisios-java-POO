package calculadora;
public class Main {
    public static void main(String[] args) {
        Calculadora cal= new Calculadora();

        double resultado1=cal.operar(5,10, Operacion.SUMA);
        double resultado2=cal.operar(5,10, Operacion.RESTA);
        double resultado3=cal.operar(5,10, Operacion.MULTIPLICACION);
        double resultado4=cal.operar(5,10, Operacion.DIVISION);

        System.out.println("LA SUMA DE LOS NUMEROS ES: "+resultado1);
        System.out.println("LA RESTA DE LOS NUMEROS ES: "+resultado2);
        System.out.println("EL PRODUCTO DE LOS NUMEROS ES: "+resultado3);
        System.out.println("LA DIVISION DE LOS NUMEROS ES: "+resultado4);
    }
}
