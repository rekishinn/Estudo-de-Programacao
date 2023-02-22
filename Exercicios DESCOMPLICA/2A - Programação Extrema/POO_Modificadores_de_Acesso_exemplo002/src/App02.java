import discentes.AlunoSuperior02;

public class App02 {
    public static void main(String[] args) {

        AlunoSuperior02  aluno = new AlunoSuperior02();

         //aluno.nome="Oswaldo"; //dá erro, pois o parametro é privado e não pode ser acessado.
         aluno.setNome("Oswaldo");
         //aluno.teste = 9;
         aluno.setTeste(9);
         //aluno.prova = 10;
         aluno.setProva(10);

         System.out.println(aluno.getMedia());

    }
}
