public class Main {
    public static void main(String[] args) {


        RelogDigital reloj = new RelogDigital(11, 59, 55);

        reloj.configurarAlarma(12, 0);

        // Simulación
        for (int i = 0; i < 10; i++) {
            reloj.avanzarSegundo();

            System.out.println("24h: " + reloj.mostrarFormato24h());
            System.out.println("12h: " + reloj.mostrarFormato12h());

            reloj.verificarAlarma();
        }
    }
}