import java.util.Scanner;

public class Ex15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
        ConcessionariaCarango concessionaria = new ConcessionariaCarango();

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("\nInforme o valor do veículo (ou digite 0 para encerrar)");
            double valorVeiculo = leitor.nextDouble();
        
            if (valorVeiculo == 0) {
                break;
            }
            leitor.nextLine();
        
            System.out.println("Informe o tipo de combustível (alcool, gasolina ou diesel)");
            String tipoCombustivel = leitor.nextLine().toLowerCase();
        
            double desconto = concessionaria.calcularDesconto(valorVeiculo, tipoCombustivel);
            totalDesconto += desconto;
        
            double valorPago = valorVeiculo - desconto;
            totalPago += valorPago;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + valorPago);
        }
        
            System.out.println("\nTotal de desconto cedido: R$" + totalDesconto);
            System.out.println("Total pago pelos clientes: R$" + totalPago);

            leitor.close();
        }
    }
}
