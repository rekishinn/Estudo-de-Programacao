import discentes.AlunoSuperior;

public class App {
    public static void main(String[] args) {

        AlunoSuperior  aluno = new AlunoSuperior();

         //aluno.nome="Oswaldo"; //dá erro, pois o parametro é privado e não pode ser acessado.
         aluno.setNome("Oswaldo");
         //aluno.teste = 9;
         aluno.setTeste(9);
         //aluno.prova = 10;
         aluno.setProva(10);

         System.out.println(aluno.getMedia());

    }
}
