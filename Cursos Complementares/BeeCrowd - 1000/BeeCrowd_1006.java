import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BeeCrowd_1006 {
 
    public static void main(String[] args) throws IOException {

    Locale.setDefault(Locale.US);
 
    Scanner input = new Scanner(System.in);

    double nota1 = input.nextDouble();
    double nota2 = input.nextDouble();
    double nota3 = input.nextDouble();

    double MEDIA = ((nota1*2) + (nota2*3) + (nota3*5))/10;

    System.out.printf("MEDIA = %.1f%n", MEDIA);


    input.close();
    }
 
}