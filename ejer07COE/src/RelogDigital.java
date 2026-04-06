public class RelogDigital {
    private int horas;
    private int minutos;
    private int segundos;

    private int alarmaH=-1;
    private int alarmaM=-1;
    /*CONSTRUCTOR*/
    public RelogDigital(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    /*VAN LOS GETTERS*/
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    /*GETTERS QUE VALIDAN*/
    public void setHoras(int horas) {
        if(horas>=0 && horas<24) {
            this.horas = horas;
        }
    }
    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<60) {
            this.minutos = minutos;
        }
    }
    public void setSegundos(int segundos) {
        if(segundos>=0 && segundos<60) {
            this.segundos = segundos;
        }
    }
    /*para que el tiempo avance*/
    public void avanzarSegundo(){
        segundos++;

        if(segundos>=60){
            segundos=0;
            minutos++;
        }

        if (minutos>=60){
            minutos=0;
            horas++;
        }
        if (horas>=60){
            horas=0;

        }
    }
    /*PARA FORMATO DE 24H*/
    public String mostrarFormato24h(){
        return String.format("%02d:%02d", horas, minutos);
    }
    /*PARA EL FORMATO DE 12H*/
    public String mostrarFormato12h(){
        String ampm=(horas>=12) ?"PM":"AM";
        int h=horas%12;
        if(h==0) h=12;
        return String.format("%02d:%02d", h, minutos);
    }
    /*PARA CONFIGURAR LA ALARMA*/
    public void configurarAlarma(int h, int m){
        if(h>=0 && h<24 && m>=0 && m<60){
            alarmaH=h;
            alarmaM=m;
        }
    }
    /*PARA VERIFICAR LA ALARMA*/
    public void verificarAlarma() {
        if (horas == alarmaH && minutos == alarmaM && segundos == 0) {
            System.out.println("Alarma activada!");
        }
    }
}

