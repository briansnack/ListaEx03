public class ContaDeLuz {
    private int tipoCliente;
    private double valorPorKWh;

    public ContaDeLuz(int tipoCliente, double valorPorKWh) {
        this.tipoCliente = tipoCliente;
        this.valorPorKWh = valorPorKWh;
    }

    public double calcularConta(double consumoKWh) {
        return consumoKWh * valorPorKWh;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getValorPorKWh() {
        return valorPorKWh;
    }

    public void setValorPorKWh(double valorPorKWh) {
        this.valorPorKWh = valorPorKWh;
    }
}
