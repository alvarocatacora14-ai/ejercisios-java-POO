package semaforo;

public enum EstadoSemaforo {
    ROJO(30){
        @Override
        public EstadoSemaforo siguiente(){
            return VERDE;
        }
    },
    VERDE(25){
        @Override
        public EstadoSemaforo siguiente(){
            return AMARILLO;
        }
    },
    AMARILLO(5){
        @Override
        public EstadoSemaforo siguiente(){
            return ROJO;
        }
    };
    private int duracionesSegun;

    EstadoSemaforo(int duraciones){
        this.duracionesSegun = duraciones;
    }
    public int getDuracion(){
        return this.duracionesSegun;
    }
    public abstract EstadoSemaforo siguiente();
}
