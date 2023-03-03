package Collection_HashMap_e_Hashtable_exemplo002.src;

import java.util.HashMap;

public class Collection_HashMap_e_Hashtable_exemplo002 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>(); //Integer é o tipo da chave (oq vai ser chamado) e String é o elemento de fato.
        linguagensProgramacao.put(1, "C++"); // chave, valor
        linguagensProgramacao.put(2, "Java"); //chave, valor
        linguagensProgramacao.put(3, "Cobol"); //chave, valor
        System.out.println("Conteudo do HashMap: " + linguagensProgramacao); //print: Conteudo do HashMap: {1=C++, 2=Java. 3=Cobol}

        System.out.println("Chaves: " + linguagensProgramacao.keySet()); //print: Chaves: [1, 2, 3]
        System.out.println("Valores: " + linguagensProgramacao.values()); //print: Valores: [C++, Java, Cobol]
        System.out.println("Chave/valor: " + linguagensProgramacao.entrySet()); //print: Chave/valor: [1=C++, 2=Java. 3=Cobol]
    }
}