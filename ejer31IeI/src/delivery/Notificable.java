package delivery;

public interface Notificable {
    String getContacto();

    default void notificar(String mensaje) {
        System.out.println("NOTIFICACION A: "+getContacto()+ ": "+mensaje);
    }

}
