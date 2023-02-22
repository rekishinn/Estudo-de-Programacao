public class App {
    public static void main(String[] args) { 

        Aluno_EnsinoMedio alunoEnsinoMedio = new Aluno_EnsinoMedio();
        Aluno_EnsinoSuperior alunoEnsinoSuperior = new Aluno_EnsinoSuperior();

        alunoEnsinoMedio.setNome("Jose");
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno do Ensino Médio: ");
        System.out.println(alunoEnsinoMedio.getNome());
        System.out.println(alunoEnsinoMedio.getMedia());

        


        alunoEnsinoSuperior.setNome("Jose");
        alunoEnsinoSuperior.teste = 8;
        alunoEnsinoSuperior.prova = 9;

        System.out.println("Aluno do Ensino Superior: ");
        System.out.println(alunoEnsinoSuperior.getNome());
        System.out.println(alunoEnsinoSuperior.getMedia());

    }
}
