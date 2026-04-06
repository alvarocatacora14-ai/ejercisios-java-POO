package rpg;

public class Mago extends Personaje {
    private int energia;
    public Mago(String nombre, int vida, int ataque, int defensa,int energia) {
        super(nombre, vida, ataque, defensa);
        this.energia = energia;
    }
    @Override
    public void usarHabilidadEspecial(Personaje enemigo){
        if(energia>=20){
            int dano=ataque*2;
            /*EJEMPLO CON INSTANCEOFF O RESISTENCIA MAGICA*/
            if(enemigo instanceof Mago){
                dano=dano/2;
                System.out.println("EL ENEMIGO MAGOR RESISTE ´PARTE DEL DAÑO MAGICO");
            }

            enemigo.vida-=dano;
            energia-=20;
            System.out.println(nombre+ "LANZA HECHIZO E INFLINGE"+dano+"DE DAÑO");
        }else {
            System.out.println(nombre+ "NO TIENE SUFICIENTE ENERGIA");
        }
    }
}
