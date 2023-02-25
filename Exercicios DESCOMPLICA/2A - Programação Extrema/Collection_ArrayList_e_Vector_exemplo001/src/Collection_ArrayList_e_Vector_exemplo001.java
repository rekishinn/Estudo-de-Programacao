package Collection_ArrayList_e_Vector_exemplo001.src;

import java.util.ArrayList;

public class Collection_ArrayList_e_Vector_exemplo001 {
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>(); //Esse objeto é um vetor em q cada elemento é do tipo String <> = generics
        listaNome.add("Oswaldo"); //posiçao 0
        listaNome.add("Gisele"); //posiçao 1
        listaNome.add("Giovanna"); //posiçao 2
        listaNome.add("Giulianna"); //posiçao 3

        System.out.println("Antes");

        for(String nome: listaNome) { //printando normalmente listaNome
            System.out.println(nome);
        }

        listaNome.set(1,"Jujuba"); //set vai trocar o elemento da posição 1 (q era Gisele) para Jujuba

        System.out.println(); //espaço
        System.out.println(); //espaço

        System.out.println("Depois");

        for(String nome: listaNome) {
            System.out.println(nome);
        }
    }
}
