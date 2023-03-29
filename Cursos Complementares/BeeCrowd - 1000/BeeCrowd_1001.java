import java.io.IOException;
import java.util.Scanner;

public class BeeCrowd_1001 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        int A, B, X;
        
        System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        B = input.nextInt();
        
        X = A + B;
        
        System.out.printf("X = %d\n", X);
        
        input.close();
    }
    
}