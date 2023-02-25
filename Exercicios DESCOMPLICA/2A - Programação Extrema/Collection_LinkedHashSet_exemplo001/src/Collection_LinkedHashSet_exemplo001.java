package Collection_LinkedHashSet_exemplo001.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_LinkedHashSet_exemplo001 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numerosArrayList = new ArrayList<>(); //integer = inteiro = int
        numerosArrayList.add(8);
        numerosArrayList.add(5);
        numerosArrayList.add(8);

        System.out.println("LinkedHashSet: " + numerosArrayList); //há duplicatas

        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.addAll(numerosArrayList); //adiciona os elementos da lista numerosArrayList para numerosLinkedHashSet
        numerosLinkedHashSet.add(4); //adiciona mais um numero 4 no final da lista

        Iterator<Integer> iterator = numerosLinkedHashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println("LinkedHashSet: " + iterator.next()); //não há duplicatas, por ser set
        }
    }
}
