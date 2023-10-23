import java.util.List;

public class ListAlgos {

     public static <T extends Comparable<T>> T min(List<T> lista){
        if(lista == null || lista.size() == 0) return null;
        
        T min = lista.get(0);
        
        for(T item : lista){
            if(item.compareTo(min) < 0)min = item;
        }
        
        return min;
    }

    public static <T extends Comparable<T>> T max(List<T> lista){
        if(lista == null || lista.size() == 0) return null;
        
        T max = lista.get(0);
        
        for(T item : lista){
            if(item.compareTo(max) > 0) max = item;
        }
        
        return max;
    }
}
