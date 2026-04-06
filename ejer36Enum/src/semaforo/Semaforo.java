package semaforo;

public class Semaforo {
    private EstadoSemaforo estadoActual;

    public Semaforo() {
        this.estadoActual=EstadoSemaforo.ROJO;
    }
    public void cambiarEstado(){
        estadoActual=estadoActual.siguiente();
    }
    public void mostrarEstado(){
        System.out.println(estadoActual+ "("+estadoActual.getDuracion()+ "s)");
    }

    public EstadoSemaforo getEstadoActual() {
        return estadoActual;
    }
}
