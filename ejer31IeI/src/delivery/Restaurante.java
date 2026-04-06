package delivery;
import java.util.ArrayList;
public class Restaurante implements Rastreable, Calificable, Notificable {
    private String nombre;
    private String ubicacion;
    private String estado;
     private String contacto;
     private ArrayList<Integer> calificaciones=new ArrayList<>();

     public Restaurante(String nombre, String ubicacion, String estado, String contacto) {
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
    public void calificar(int estrellas) {
         calificaciones.add(estrellas);
    }
    @Override
    public double getpromedio() {
         return calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
    @Override
    public String getContacto() {
         return contacto;
    }
}

