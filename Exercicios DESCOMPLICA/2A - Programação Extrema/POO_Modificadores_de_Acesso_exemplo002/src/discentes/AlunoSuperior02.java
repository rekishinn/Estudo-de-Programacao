package discentes;

public class AlunoSuperior02 extends Aluno02 {
    
    public double getMedia() {
        return (getTeste() + getProva())/2;
    }

}
