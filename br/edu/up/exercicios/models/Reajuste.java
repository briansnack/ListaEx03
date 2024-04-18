public class Reajuste {
    private double salario;
    private double salarioMinimo;

    public double getSalario() {
        return salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste(){
        double reajuste = 0;
        if (salario < 3 * salarioMinimo) {
            reajuste = salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            reajuste = salario * 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            reajuste = salario * 0.15;
        } else {
            reajuste = salario * 0.1;
        }
        return reajuste;
    }
}  
