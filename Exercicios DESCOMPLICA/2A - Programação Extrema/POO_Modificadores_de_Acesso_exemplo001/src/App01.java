import discentes.AlunoSuperior01;

public class App01 {
    public static void main(String[] args) {

        AlunoSuperior01  aluno = new AlunoSuperior01();

         aluno.nome="Oswaldo"; //consigo acessar nome, teste e prova de outra classe, pois o parametro é publica.
         aluno.teste = 9;
         aluno.prova = 10;

         System.out.println(aluno.getMedia());

    }
}
