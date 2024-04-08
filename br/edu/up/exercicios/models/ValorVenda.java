public class ValorVenda {
    public static double calcularVenda(double produto, double acrescimo){
        double valorTotal =  produto * (1 + acrescimo / 100); 
        return valorTotal;
    }
}
