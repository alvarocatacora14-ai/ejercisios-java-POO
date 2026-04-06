package rpg;

public class Main {
    public static void main(String[] args) {

        Guerrero g = new Guerrero("Thor", 100, 20, 10, 20);
        Mago m = new Mago("Merlin", 80, 25, 5, 40);
        Arquero a = new Arquero("Legolas", 90, 18, 8, 5);

        System.out.println("=== COMBATE ===");

        // Turno 1
        System.out.println("Guerrero ataca a Mago: " + g.atacar(m));
        m.usarHabilidadEspecial(g);

        // Turno 2
        a.usarHabilidadEspecial(g);
        g.usarHabilidadEspecial(a);

        // Estado final
        System.out.println("\n=== VIDA FINAL ===");
        System.out.println("Guerrero: " + g.vida);
        System.out.println("Mago: " + m.vida);
        System.out.println("Arquero: " + a.vida);
    }
}