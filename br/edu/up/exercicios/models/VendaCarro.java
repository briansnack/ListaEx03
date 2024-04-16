public class VendaCarro {
    private double custo;

    public void setCusto(double custo){
        this.custo = custo;
    }

    public double calcularVendaCarro(){
        double imposto = custo * 0.45;
        double custoComImpostos = custo += imposto;
        double porcentagemDistribuidor = 0.23;
        double valorFinal = custoComImpostos * (1 + porcentagemDistribuidor);
        return valorFinal;
    }
}
