import java.io.File;
import java.util.Scanner;

public class Arquivos_exemplo001 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.printf("Digite o nome d e um arquivo com o seu path:/n;"); //printf é uma saida formatada, logo é preciso do /n
            String nome = teclado.next();
            
            File objFile = new File(nome); //criado um objeto do tipo File (objFile), instanciado pelo nome do arquivo puxado pelo teclado
            if (objFile.exists()) { //se a referencia do objeto existe:
                if (objFile.isFile()) { //se ele é um arquivo:
                    System.out.println("Nome do arquivo: " + objFile.getName()); //nome do arquivo
                    System.out.println("Tamanho do arquivo: " + objFile.length()); //tamanho do arquivo
                }
            } else System.out.println("Arquivo inexistente");
        }
    }
}
