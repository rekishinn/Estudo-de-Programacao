public class App003 {
    public static void main(String[] args) { 

        Aluno03 aluno = new Aluno03();
        Professor03 professor = new Professor03();

        aluno.setNome("Oswaldo"); //setNome "setta" o atributo
        aluno.teste = 9;
        aluno.prova = 10;

        System.out.println(aluno.getNome()); //getNome "puxa" o atributo
        System.out.println(aluno.getMedia());

        professor.setNome("Carlos");
        professor.setSalario(1000);

        System.out.println(professor.getNome());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());

    }
}
