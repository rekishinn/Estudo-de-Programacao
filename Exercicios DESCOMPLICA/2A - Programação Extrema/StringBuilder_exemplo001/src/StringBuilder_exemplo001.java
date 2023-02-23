public class StringBuilder_exemplo001 {
    public static void main(String[] args) {
        
        String nome = "Oswaldo";
        String sobreNome = "Borges";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        System.out.println(nomeCompleto);


        StringBuilder buffer = new StringBuilder();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeComBuffer);
    }
}
