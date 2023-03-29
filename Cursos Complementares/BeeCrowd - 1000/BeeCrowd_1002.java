import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BeeCrowd_1002 {
 
    public static void main(String[] args) throws IOException {
        
        double raio, A, π;
        π = 3.14159;
        A = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = input.nextFloat();
        
        A = π*(Math.pow(raio, 2));

        System.out.printf("A=%.4f%n",A);
        input.close();
    }
}