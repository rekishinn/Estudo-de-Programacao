import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BeeCrowd_1005 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        
        float A, B;

        //System.out.println("Digite o valor de A:");
        A = input.nextFloat();
        
        //System.out.println("Digite o valor de B:");
        B = input.nextFloat();

        double media = (3.5 * A + 7.5 * B)/11;
        System.out.printf("MEDIA = %.5f%n",media);

        input.close();
 
    }
 
}