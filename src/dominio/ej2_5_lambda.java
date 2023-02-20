package dominio;
import java.util.stream.Stream;
public class ej2_5_lambda {
    public static int media(int[] lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b)/ lista.length;
    }
}
