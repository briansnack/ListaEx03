public class Prestacao {
    private double valorCompra;

    public void setPrestacao(double valorCompra){
        this.valorCompra = valorCompra;
    }
    
    public double calcularPrestacao(){
        return valorCompra / 5;
    }
}
