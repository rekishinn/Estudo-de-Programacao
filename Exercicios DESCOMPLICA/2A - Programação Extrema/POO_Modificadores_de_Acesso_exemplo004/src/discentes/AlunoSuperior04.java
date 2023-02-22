package discentes;

public class AlunoSuperior extends Aluno {
    
    public double getMedia() { //assumindo como default(padrão)
        return (getTeste() + getProva())/2;
    }

}
