public class aula03 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC cristal"; // modelo é publico, então posso modificar.
        c1.cor = "Azul"; // cor é publico, então posso modificar.
        //c1.ponta = 0.5; // ponta é privada, então não posso modificar.
        c1.carga = 80 // carga é protegida, logo, posso modificar pois, nesse caso, estou dentro de uma 
                      //classe que está usando a classe caneta


        c1.status();

    }
    
}
