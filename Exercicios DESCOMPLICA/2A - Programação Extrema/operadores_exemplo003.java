import java.util.Scanner;

public class operadores_exemplo003 {
    public static void main(String[] args) {

        double nota1 = 9;
        double nota2 = 10;

        double media;

        media = (nota1 + nota2) / 2;
        System.out.println(media);



        int valor;

        try (Scanner teclado = new Scanner(System.in)) { //scanner cria um input pra o usuario
            System.out.println("Digite um valor: ");
            valor = teclado.nextInt(); //nextint transforma em inteiro
        }
        System.out.println(valor/2);
        System.out.println(valor%2); //% mostra o resto apenas de numeros inteiros;
    }
}
