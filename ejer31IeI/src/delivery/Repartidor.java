package delivery;

import java.util.ArrayList;

public class Repartidor implements Rastreable, Calificable, Notificable{
    private String nombre;
    private String ubicacion;
    private String estado;
    private String contacto;
    private ArrayList<Integer> calificaciones=new ArrayList<>();

    public Repartidor(String nombre, String ubicacion, String estado, String contacto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.contacto = contacto;
    }
    @Override
    public String getubicacion() {
        return ubicacion;
    }
    @Override
    public String getestado() {
        return estado;
    }
    @Override
    public void calificar(int estrellas){
        calificaciones.add(estrellas);
    }
    @Override
    public double getpromedio() {
        return calificaciones.stream().mapToDouble(Integer::intValue).average().orElse(0);
    }
    @Override
    public String getContacto() {
        return contacto;
    }
}
