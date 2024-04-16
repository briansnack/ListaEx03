public class ValorVenda {
    private double produto;
    private double acrescimo;

    public void setVendas(double produto, double acrescimo){
        this.produto = produto;
        this.acrescimo = acrescimo;
    }

    public double calcularVenda(){
        double valorTotal =  produto * (1 + acrescimo / 100); 
        return valorTotal;
    }
}
