import discentes.AlunoSuperior;

public class App {
    public static void main(String[] args) {

        AlunoSuperior  aluno = new AlunoSuperior();

         //aluno.nome="Oswaldo";
         aluno.setNome("Oswaldo");
         //aluno.teste = 9; // mesmo sendo protected, não consigo acessar, pois a classe App não é filha da classe Aluno
         aluno.setTeste(9);
         //aluno.prova = 10;
         aluno.setProva(10);

         System.out.println(aluno.getMedia());

    }
}
