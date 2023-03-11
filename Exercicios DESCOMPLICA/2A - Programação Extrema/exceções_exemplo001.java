public class exceções_exemplo001{
    public static void main(String[] args){
        
       try {

        int resultado = 10 / 0; //dovido por 0 dá erro, logo o programa fecharia automaticamente
        System.out.println(resultado);
       }

       catch (Exception e) { //pra isso o catch vai pegar o erro e printar na tela, sem fechar o programa.
        System.out.println("Erro: " + e.getMessage()); //print: Erro: / by zero

       }
        
    }
}