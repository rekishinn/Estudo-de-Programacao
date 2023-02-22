package discentes;

public class Aluno {

        private String nome;
        protected double teste, prova; //só pode ser acessado aqui e em seus filhos (por exemplo: AlunoSuperior) 
                                       //como se fosse publico da classe aluno pra baixo.

        //para ser acessado o nome, é necessario criar um metodo para acessar:
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        //para ser acessado teste e prova, é necessário também um metodo para acessar:
        public double getTeste() {
            return teste;
        }
        public void setTeste(double teste) {
            this.teste = teste;
        }
        public double getProva() {
            return prova;
        }
        public void setProva(double prova) {
            this.prova = prova;
        }
    }
