public class Aluno_EnsinoMedio {
    
    String nome;
    double teste, prova;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome(){
        return this.nome; //retorna o atributo nome
    }

    double getMedia() {
        return (teste + prova)/2;
    }

    public void configurarNome(String string) {
    }

}
