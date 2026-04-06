package Figuras;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String descripcion(){
        return color+"|AREA: "+ calcularArea();
    }
}
