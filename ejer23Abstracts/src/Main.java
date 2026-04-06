
package Figuras;

public class Main {
    public static void main(String[] args) {

        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 4, 3, 3, 4, 5);

        System.out.println(c.descripcion());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println(r.descripcion());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        System.out.println(t.descripcion());
        System.out.println("Perímetro: " + t.calcularPerimetro());


    }
}