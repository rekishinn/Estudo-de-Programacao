import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BeeCrowd_1004 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int PROD, A, B;

        //System.out.println("Digite o valor de A:");
        A = input.nextInt();
        
        //System.out.println("Digite o valor de B:");
        B = input.nextInt();

        PROD = A * B;
        System.out.printf("PROD = " + PROD + "%n");

        input.close();
 
    }
 
}