package inventario;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario implements Iterable<Producto>{
    private ArrayList<Producto> productos=new ArrayList<>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    /*clas interna interator pernonalizada*/
    private class IteradorDisponible implements Iterator<Producto> {
        private int poscision=0;
        @Override
        public boolean hasNext() {
            while(poscision<productos.size()&&
            productos.get(poscision).getStock()<=0){
                poscision++;
            }
            return poscision<productos.size();
        }
        @Override
        public Producto next() {
            return productos.get(poscision++);
        }
    }
    @Override
    public Iterator<Producto> iterator() {
        return new IteradorDisponible();
    }
}
