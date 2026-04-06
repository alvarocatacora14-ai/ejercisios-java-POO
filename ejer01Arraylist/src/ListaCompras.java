import java.util.ArrayList;
import java.util.Collections;
public class ListaCompras {
    /*MI ATRIBUTO PRIVADO*/
    private ArrayList<String> productos;
    /*CONTRUCTOR*/
    public ListaCompras() {
        productos = new ArrayList<>();
    }
    /*METODO PARA AGREGAR PRODUCTO*/
    public void agregarProducto(String producto){
       if(!productos.contains(producto)){
           productos.add(producto);
           System.out.println("PRODUCTO AGREGADO: "+producto);
       }else {
           System.out.println("EL PRODUCTO YA EXISTE: "+producto);
       }
    }
    /*METODO PARA PODER ELIMINAR EL PRODUCTO*/
    public void eliminarProduto(String produto){
        if (productos.contains(produto)) {
            productos.remove(produto);
            System.out.println("PRODUCTO ELIMINADO: "+produto);
        } else {
            System.out.println("DICHO PRODUCTO NO EXISTE: "+ produto);
        }
    }
    /*METODO PARA BUSCAR PRODUCTO*/
    public void buscarProduto(String produto){
        if (productos.contains(produto)) {
            System.out.println("PRODUCTO ENCONTRADO: "+produto);
        } else {
            System.out.println("PRODUCTO NO ENCONTRADO: "+produto);
        }
    }
    /*METODO PARA CONTAR PRODUCTOS*/
       public int contarProductos() {
           return productos.size();
       }
       /*METODO PARA ORDENR DE MANERA ALFABETICA*/
    public void ordenarAlfabetica(){
        Collections.sort(productos);
        System.out.println("LISTA ORDENADA DE MANERA ALFABÉTICAENTE");
    }
    /*PARA MOSTRAR LA LISTA*/
    public void mostrarLista(){
        System.out.println("LISTA DE COMPRAS: ");
        for (String produto: productos) {
            System.out.println("- "+produto);
        }
    }
       }



