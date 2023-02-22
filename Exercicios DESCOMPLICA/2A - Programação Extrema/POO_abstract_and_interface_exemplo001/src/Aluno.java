public abstract class Aluno extends Pessoa implements Media {
    
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
