public abstract class Aluno01 extends Pessoa01 implements Media01 {
    
    double teste, prova;

    void setTest(double teste) {
        this.teste = teste;
    }

    double getTeste() {
        return this.teste;
    }

    void setProva(double prova) {
        this.prova = prova;
    }

    double getProva(){
        return this.prova;
    }

    public abstract double getMedia();

}
