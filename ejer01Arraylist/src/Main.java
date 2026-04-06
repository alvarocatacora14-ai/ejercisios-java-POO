//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
    ListaCompras lista = new ListaCompras();
    lista.agregarProducto("ARROZ");
    lista.agregarProducto("POLLO");
    lista.agregarProducto("PAN");
    lista.agregarProducto("LECHE");
    lista.mostrarLista();

    lista.buscarProduto("PAN");
    lista.eliminarProduto("LECHE");

    lista.ordenarAlfabetica();
    lista.mostrarLista();

    System.out.println("TOTAL DE PRODUCTOS: "+lista.contarProductos());
}
    }

