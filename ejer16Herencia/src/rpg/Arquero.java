package rpg;

public class Arquero extends Personaje{
    private int flechas;
    public Arquero(String nombre, int vida, int ataque, int defensa, int flechas){
        super(nombre, vida, ataque, defensa);
        this.flechas = flechas;
    }
    @Override
    public void usarHabilidadEspecial(Personaje enemigo){
        if (flechas>=1){
            int dano=ataque+15;
            enemigo.vida-=dano;
            flechas--;
            System.out.println(nombre+ "DISPARA UNA FLECHA CRITICA E INFLINGE "+dano+ "DE DAÑO");
        }else {
            System.out.println(nombre+" NO TIENE FLECHAAS");
        }
    }
}
