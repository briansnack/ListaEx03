public class ConcessionariaCarango {
    public static double calcularDesconto(double valorVeiculo, String tipoCombustivel){
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
}
