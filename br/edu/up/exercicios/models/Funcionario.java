public class Funcionario {
    private double salario;
    private double salarioMinimo = 1100.00;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public double getSalarioMinimo(){
        return salarioMinimo;
    }

    public double calcularReajuste() {
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
