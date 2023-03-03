import java.util.HashMap;

public class Collection_HashMap_e_Hashtable_exemplo001 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>(); //Integer é o tipo da chave (oq vai ser chamado) e String é o elemento de fato.
        linguagensProgramacao.put(1, "C++"); // chave, valor
        linguagensProgramacao.put(2, "Java"); //chave, valor
        linguagensProgramacao.put(3, "Cobol"); //chave, valor
        System.out.println("Conteudo do HashMap: " + linguagensProgramacao); //print: Conteudo do HashMap: {1=C++, 2=Java. 3=Cobol}

        String valor = linguagensProgramacao.get(2); //pega o valor da chave 2, que é nesse caso Java
        System.out.println("Elemento da chave 2:" + valor); //print: Java
    }
}
