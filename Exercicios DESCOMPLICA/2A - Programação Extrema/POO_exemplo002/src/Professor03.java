<<<<<<< HEAD
public class Professor03 {
    
    String nome;
    double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    double getInss() {
        return salario * 0.11;
    }
    double getSalarioLiquido() {
        return salario - getInss();
    }
}
=======
public class Professor03 {
    
    String nome;
    double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    double getInss() {
        return salario * 0.11;
    }
    double getSalarioLiquido() {
        return salario - getInss();
    }
}
>>>>>>> 218845b (fix and new)
