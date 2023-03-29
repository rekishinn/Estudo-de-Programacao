import java.util.Scanner; //importa a biblioteca Scanner

public class Scanner_Boson_Treinamentos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // "input" é o nome da "função" pra leitura
        String nome; // cria a variável do tipo String nome
        System.out.println("Digite seu nome: ");
        nome = input.nextLine(); //aqui ele lê e atribui oq vai ser digitado na variavel nome
        System.out.println("Bem-vindo" + nome);

        int numeroint = input.nextInt(); //para ler do tipo inteiro
        System.out.println("O número inteiro é: " + numeroint);
        float numerofloat = input.nextFloat(); //para ler do tipo float
        System.out.println("O número decimal é: " + numerofloat);

        input.close(); // fecha (OBRIGATORIO)
        
    }
} 
