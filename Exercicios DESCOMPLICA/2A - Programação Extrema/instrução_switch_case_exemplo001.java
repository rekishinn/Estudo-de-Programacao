public class instrução_switch_case_exemplo001 {
    public static void main(String[] args) {

        int numero = 1;

        switch(numero) {

        case 1:
            System.out.println("você digitou 1");
            break; //o uso de break é pq quando um case é executado, ele executa os seguintes tbm
        case 2:
            System.out.println("Você digitou 2");
            break;
        case 3:
            System.out.println("Você digitou 3");
            break;

        default:
            System.out.println("Você digitou um valor inválido");
            //caso não for nenhum caso, ele vai executar o default
    
        }

    }
}
