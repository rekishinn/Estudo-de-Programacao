public class StringBuffer_exemplo001 {
    public static void main(String[] args) {
        
        String nome = "Oswaldo";
        String sobreNome = "Borges";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        System.out.println(nomeCompleto); //esforço computacional muito maior


        StringBuffer buffer = new StringBuffer(); //criou um objeto buffer

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString(); //declara no nomeComBuffer o conteudo de buffer

        System.out.println(nomeComBuffer); //esforço computacional menor
    }
}
