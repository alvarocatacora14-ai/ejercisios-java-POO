package rpg;

public class Guerrero extends Personaje{
    private int furia;
    public Guerrero(String nombre, int vida, int ataque, int defensa, int furia){
        super(nombre, vida, ataque, defensa);
        this.furia = furia;
    }
    @Override
    public void usarHabilidadEspecial(Personaje enemigo) {
        if (furia >= 10) {
            int dano = ataque * 2;
            enemigo.vida -= dano;
            furia -= 10;
            System.out.println(nombre + " usa GOLPE FURIOSO e inflige " + dano + " de daño.");
        } else {
            System.out.println(nombre + " no tiene suficiente furia.");
        }
    }
}

