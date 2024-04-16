public class ConsumoMedio {
    private double distancia;
    private double combustivel;

    public void setConsumo(double distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }


    public double calcularConsumo(){
        return distancia / combustivel;
    }
}
