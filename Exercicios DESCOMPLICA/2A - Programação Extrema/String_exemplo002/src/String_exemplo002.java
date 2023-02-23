public class String_exemplo002 {
    public static void main(String[] args) {
        
        String nome = "Oswaldo"; //String é imútavel, não pode ser redefinido.
        String nomeGuerra = "Oswaldo";

        String sobreNome = new String("Oswaldo");

        if(nome==nomeGuerra)
            System.out.println("Nomes iguais"); //correto
        else
            System.out.println("Nomes diferentes"); //falso

        //nesse caso: nome e nomeGuerra estão "apontados" para o mesmo conteudo "Oswaldo".
        

        if(nome.equals(sobreNome)) //equals é um metodo de comparação, parecido com o ==
            System.out.println("Nomes iguais"); //se fosse ==:falso, nesse caso: verdadeiro
        else
            System.out.println("Nomes diferentes"); //se fosse ==: correto, nesse caso: falso

        //equals compara o conteudo.

        
    }
}
