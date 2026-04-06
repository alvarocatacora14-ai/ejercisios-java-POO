import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EstacionMetereologica {
    private ArrayList<Double> temperaturas;
    /*MY CONSTRUCTOR*/
    public EstacionMetereologica(){
        temperaturas = new ArrayList<>(Arrays.asList(28.5, 31.2, 29.8, 33.1, 30.5, 27.9, 35.0));
    }
    /*PROMEDIO*/
    public double calcularPromedio(){
        return temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }
    /*MAXIMO*/
    public double obtenerMaximo(){
        return Collections.max(temperaturas);
    }
    /*MINIMO*/
    public double obtenerMinimo(){
        return Collections.min(temperaturas);
    }
    /*DIAS MAYORES A 30°C*/
    public int contarDiaCaluroso(){
        int contador = 0;
        for(double temp: temperaturas){
            if(temp>30){
                contador++;
            }
        }
        return contador;
    }
    /*TENDENCIA SIMPLE*/
    public String determinarTendencia(){
        double primera=temperaturas.get(0);
        double ultima=temperaturas.get(temperaturas.size()-1);
        if(primera>ultima){
            return "SUBIENDO";
        }else  if(primera<ultima){
            return "BAJANDO";
        }
        else{
            return "ESTABLE";
        }
    }
    /*MOSTRAR DATOS*/
    public void mostrarDatos(){
        System.out.println("TEMPERATURAS: "+temperaturas);
        System.out.println("PROMEDIO: "+calcularPromedio());
        System.out.println("OBTENER MAXIMO: "+obtenerMaximo());
        System.out.println("OBTENER MINIMO: "+obtenerMinimo());
        System.out.println("DIAS >30°C: "+contarDiaCaluroso());
        System.out.println("TENDENCIAS: "+determinarTendencia());
    }
}
