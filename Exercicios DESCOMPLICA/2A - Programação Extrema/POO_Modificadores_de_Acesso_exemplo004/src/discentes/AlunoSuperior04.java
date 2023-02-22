package discentes;

public class AlunoSuperior04 extends Aluno04 {
    
    public double getMedia() { //assumindo como default(padrão)
        return (getTeste() + getProva())/2;
    }

}
