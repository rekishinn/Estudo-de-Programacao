package Collection_HashSet_exemplo001.src;

import java.util.HashSet; //mesma coisa do arraylist

public class Collection_HashSet_exemplo001 {
    public static void main(String[] args) {

        HashSet<String> listaNome = new HashSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");
        listaNome.add("Oswaldo"); //duplicado  intencionalmente, pois não é printado duas vezes


        for (String nome:listaNome) {
            System.out.println(nome);
        }
    }
}
