public class Salario {
    private double salarioF;
    private double vendas;

    public void setSalario(double salarioF, double vendas){
        this.salarioF = salarioF;
        this.vendas = vendas;
    }
    public double calcularSalario(){
        return salarioF + (vendas * 0.15);
    }
}
