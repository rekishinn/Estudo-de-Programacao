import java.util.Scanner;

public class exceções_exemplo003{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Digite o número 1 ou 2:");
            System.out.println();
            try{
                opcao = teclado.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Você digitou a opção " + opcao);
                        break;
                    case 2:
                        System.out.println("Você digitou a opção " + opcao);
                    default:
                    throw new Excecao("Erro"); //throw força a mostrar o erro
                }
            }
            catch(Excecao excecao){
                System.out.println(excecao.getMessage());
            }
            finally {
                System.out.println("---------------");
            }
        }while(true);
        
    }
}