public class App {
    public static void main(String[] args) { 

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

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
