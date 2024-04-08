public class VendaCarro {
    public static double calcularVendaCarro(double custo){
        double imposto = custo * 0.45;
        double custoComImpostos = custo += imposto;
        double porcentagemDistribuidor = 0.23;
        double valorFinal = custoComImpostos * (1 + porcentagemDistribuidor);
        return valorFinal;
    }
}
