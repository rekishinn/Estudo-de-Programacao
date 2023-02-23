<<<<<<< HEAD
public class Professor04 extends Pessoa04{
    
    double salario;
    
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
public class Professor04 extends Pessoa04{
    
    double salario;
    
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
