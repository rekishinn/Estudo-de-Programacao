package Collection_ArrayList_e_Vector_exemplo003.src;

import java.util.Vector;

public class Collection_ArrayList_e_Vector_exemplo003 {
    public static void main(String[] args) {
        
        Vector<String> listaNome = new Vector<>(); //praticamente a mesma coisa do ArrayList, só que Vector é thread protected
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");

        System.out.println("Antes");

        for(String nome: listaNome) {
            System.out.println(nome);
        }
    }
}
