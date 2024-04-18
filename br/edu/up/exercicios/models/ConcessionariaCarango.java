public class ConcessionariaCarango {
    private double valorVeiculo;
    private String tipoCombustivel;

    public ConcessionariaCarango(double valorVeiculo, String tipoCombustivel){
        this.valorVeiculo = valorVeiculo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularDesconto(){
        double desconto;
        switch (tipoCombustivel) {
            case "alcool":
                desconto = valorVeiculo * 0.25;
                break;

            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;

            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;

            default:
                desconto = 0;
                System.out.println("Tipo de combustível inválido");
                
        }
        return desconto;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

}