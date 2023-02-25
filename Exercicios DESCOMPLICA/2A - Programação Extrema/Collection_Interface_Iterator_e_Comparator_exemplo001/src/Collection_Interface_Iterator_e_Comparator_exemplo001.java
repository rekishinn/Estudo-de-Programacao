package Collection_Interface_Iterator_e_Comparator_exemplo001.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Interface_Iterator_e_Comparator_exemplo001 {
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>(); //dentro do <> vc define de que tipo é os elementos do vetor, nesse caso: String
        listaNome.add("Oswaldo"); //vai adicionar ao vetor como posição 0. add é um metodo do ArrayList
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");

        Iterator<String> iterator = listaNome.iterator(); // iterator sabe como "pecorrer" no vetor

        while(iterator.hasNext()) { //na condição hasNext pergunta ao iterator se há mais algum elementom, se verdade:
            System.out.println(iterator.next()); //ele printa o proximo elemento q foi perguntado anteriormente
        }
    }
}
