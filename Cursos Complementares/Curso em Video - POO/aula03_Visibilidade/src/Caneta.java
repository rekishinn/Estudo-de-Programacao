public class Caneta {
   
    //visibilidade padrão: publica

    public String modelo; //visibilidade publica
    public String cor; //visibilidade publica
    private float ponta; //visibilidade privada
    protected int carga; //visibilidade protegida
    protected boolean tampada; //visibilidade protegida

    public void rabiscar() {

        if (this.tampada == true) {
            System.out.println("ERRO: Não posso rabiscar.");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }

    protected void tampar() {

        this.tampada = true;

    }
    
    protected void destampar() {

        this.tampada = false;

    }

    void status() {

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada? " + this.tampada);
        
    }
}
