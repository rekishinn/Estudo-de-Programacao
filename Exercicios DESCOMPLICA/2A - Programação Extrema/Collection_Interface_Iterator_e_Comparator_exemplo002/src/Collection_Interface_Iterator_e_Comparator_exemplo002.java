package Collection_Interface_Iterator_e_Comparator_exemplo002.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Interface_Iterator_e_Comparator_exemplo002 {
    public static void main(String[] args) {
        
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Oswaldo");
        listaNomes.add("Gisele");
        listaNomes.add("Giovanna");
        listaNomes.add("Giulianna");
        listaNomes.add("Jujuba");

        System.out.println("Elementos antes da ordenação:");
        
        for (int i=0; i<listaNomes.size(); i++) //usar o for não é adequado, pois em outros casos pode dar erro, deve ser usado o iterator.
            System.out.println(listaNomes.get(i));
        
        //Se eu quiser q seja listado em ordem descrente, por exemplo:

        Comparator<String> comparator = Collections.reverseOrder(); //o critério de comparação vai ser inverter a ordem

        Collections.sort(listaNomes, comparator); //sort depende de dois parametros: oq ele vai comparar (listaNomes) e o criterio a ser usado (comparator = reverserOrder)

        System.out.println("Elementos depois da ordenação:");

        for(String nome: listaNomes) //outra forma de usar o for pra printar, mesmo sendo recomendado o uso do iterator
            System.out.println(nome);
        
    }
}
