import java.util.InputMismatchException;
import java.util.Scanner;

public class excessões_exemplo002{
    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner(System.in)) {
            int valor;

            try {

                System.out.println("Digite o numerador: ");
                valor = scanner.nextInt();

                int resultado = valor / 3;
                System.out.println(resultado);
            }

            catch (ArithmeticException e) { //para erros aritmeticos, por exemplo, 0 / 3, é impossivel, matematicamente, dividir 0 por 3.
                System.out.println("ArithmeticException => " +e.getMessage());
            }
            catch (InputMismatchException e) { //para erros onde, por exemplo, se calcula a / 3, "a" é um valor invalido, entrada de dados invalido.
                System.out.println("InputMismatchException => " + e.getMessage());
            }
            catch (Exception e) { //quanto mais generico for o catch, mas embaixo deve ficar.
                System.out.println("Exception => " + e.getMessage());
            }
            finally { // é uma linha que SEMPRE vai acontecer, independente de dar erro ou não.
                System.out.println("Fim");
            }
            
        }


        
    }
}