public class String_exemplo003 {
    public static void main(String[] args) {
        String nome = "Oswaldo Borges";

        System.out.println(nome); //printa o conteudo de nome

        System.out.println(nome.length()); //printa a quantidade de caracteres
        System.out.println(nome.toLowerCase()); //transforma tudo em minusculo
        System.out.println(nome.toUpperCase()); //transforma tudo em maisculo
        System.out.println(nome.charAt(2)); //printa o caractere da posição 2 (começando do 0)
        System.out.println(nome.isEmpty()); //printa verdadeiro ou falso se tiver vazio ou não
        System.out.println(nome.indexOf("al")); // mostra em qual posição está o caractere
        System.out.println(nome.contains("al")); //printa verdadeiro ou falso se tiver o caractere
        System.out.println(nome.concat("Peres")); // junta/acrescenta o conteudo
        System.out.println(nome.equals("oswaldo borges")); //printa verdadeiro ou falso se o conteudo é igual ou não
        System.out.println(nome.equalsIgnoreCase("oswaldo borges")); //printa verdadeiro ou falso se o conteudo é igual ou não ignorado o case
    }
}
