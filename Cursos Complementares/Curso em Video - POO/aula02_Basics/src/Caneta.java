public class Caneta {
   
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() { //void pois esse metodo não retorna nenhum valor

        if (this.tampada == true) {
            System.out.println("ERRO: Não posso rabiscar.");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {

        this.tampada = true; //THIS é o nome do objeto a ser criado, que nesse caso é c1

    }
    
    void destampar() {

        this.tampada = false;

    }

    void status() {

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada? " + this.tampada);
        
    }
}
