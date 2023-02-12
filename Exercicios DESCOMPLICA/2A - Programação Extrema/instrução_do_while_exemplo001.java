public class instrução_do_while_exemplo001 {
    public static void main(String[] args) {

        int numero = 1;

        do { //do while executa e apenas no final lê a condição

            System.out.println(numero);
            numero++;

        } while (numero <= 5);

    }
}
