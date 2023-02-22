package discentes;

public class Aluno {

    String nome; //assumindo como default(padrão)
    double teste, prova; //assumindo como default(padrão)

    //para ser acessado o nome, é necessario criar um metodo para acessar:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //para ser acessado teste e prova, é necessário também um metodo para acessar:
    public double getTeste() {
        return teste;
    }
    public void setTeste(double teste) {
        this.teste = teste;
    }
    public double getProva() {
        return prova;
    }
    public void setProva(double prova) {
        this.prova = prova;
    }
}

//pode ser acessado em qualquer outra classe e suas filhas mas que seja do mesmo pacote.
