import discentes.AlunoSuperior;

public class App {
    public static void main(String[] args) {

        AlunoSuperior  aluno = new AlunoSuperior();

         aluno.nome="Oswaldo"; //consigo acessar nome, teste e prova de outra classe, pois o parametro é publica.
         aluno.teste = 9;
         aluno.prova = 10;

         System.out.println(aluno.getMedia());

    }
}
