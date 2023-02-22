import discentes.AlunoSuperior;

public class App {
    public static void main(String[] args) {

        AlunoSuperior  aluno = new AlunoSuperior();

         //aluno.nome="Oswaldo"; //não consigo acessar, pois a classe App não faz parte do package discentes.
         aluno.setNome("Oswaldo");
         //aluno.teste = 9;
         aluno.setTeste(9);
         //aluno.prova = 10;
         aluno.setProva(10);

         System.out.println(aluno.getMedia());

    }
}
