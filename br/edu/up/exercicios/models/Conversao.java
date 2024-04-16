public class Conversao {
    private double qtdDolar;
    private double valorDolar;

    public void setConversao(double qtdDolar, double valorDolar){
        this.qtdDolar = qtdDolar;
        this.valorDolar = valorDolar;
    }
    public double convesaoDolar(){
        return qtdDolar * valorDolar;
    }
}
