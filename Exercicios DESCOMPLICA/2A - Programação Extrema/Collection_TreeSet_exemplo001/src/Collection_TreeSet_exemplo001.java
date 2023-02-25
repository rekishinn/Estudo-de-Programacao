package Collection_TreeSet_exemplo001.src;

import java.util.Iterator;
import java.util.TreeSet; //é a mesma coisa do hashset e do arraylist, né foda?

public class Collection_TreeSet_exemplo001 {
    public static void main(String[] args) {

        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");
        listaNome.add("Oswaldo"); 

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
