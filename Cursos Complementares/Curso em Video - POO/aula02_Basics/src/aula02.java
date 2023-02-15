public class aula02 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta(); //cria um objeto c1 na classe (molde) Caneta

        // referencia a atributo

        c1.cor = "Azul"; 
        c1.ponta = 0.5f;

        // referencia a metodo

        c1.destampar(); //um metodo para destampar a caneta
        c1.status(); // um metodo para atualizar seu status atual
        c1.rabiscar(); // um metodo para rabiscar

        System.out.println("--------------------");

        //criando uma nova INSTANCIA da classe caneta

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.ponta = 0.5f;
        c2.cor = "Preta";

        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
