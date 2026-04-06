package rpg;
public class Personaje{
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;


public  Personaje (String nombre, int vida, int ataque, int defensa){
    this.nombre = nombre;
    this.vida = vida;
    this.ataque = ataque;
    this.defensa = defensa;
}
public int atacar(Personaje enemigo){
    int dano=Math.min(0, this.ataque-enemigo.defensa);
    enemigo.vida -= dano;
    return dano;
}
public void usarHabilidadEspecial(Personaje enemigo){
    System.out.println(nombre+ "NO TIENE HAILIDAD ESPECIAL");
}
public boolean estVivo(){
    return vida>0;
}
}