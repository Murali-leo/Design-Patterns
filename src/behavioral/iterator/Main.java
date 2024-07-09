package iterator;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
        NamedList namedList = new NamedList();
        for(IteratorPattern it = namedList.getIterator(); it.hasNext();){
            System.out.println(it.next());
        }
        List<String> location = Arrays.asList("Mumbai", "Vizag", "Bengaluru");
        Iterator<String> iterator = location.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } 
    }
    
}
