
public class App004 {
    public static void main(String[] args) { 

        Aluno04 aluno = new Aluno04();
        Professor04 professor = new Professor04();

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
