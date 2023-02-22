package discentes;

public class AlunoSuperior03 extends Aluno03 {
    
    public double getMedia() {
        return (getTeste() + getProva())/2;
    }

}
