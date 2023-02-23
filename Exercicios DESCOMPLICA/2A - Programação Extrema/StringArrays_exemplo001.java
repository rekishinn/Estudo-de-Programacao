import java.util.Scanner;

public class StringArrays_exemplo001{
    public static void main(String[] args){
       
        try (Scanner teclado = new Scanner(System.in)) {
            String nome;
            System.out.println("Digite o seu nome: ");
            nome=teclado.next(); //ou nome=teclado.nextLine

            System.out.println("Professor" + nome);
        }

    }
}