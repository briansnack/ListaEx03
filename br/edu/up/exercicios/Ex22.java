import java.util.Scanner;

public class Ex22 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (1 para residência, 2 para comércio, 3 para indústria): ");
        int tipoCliente = leitor.nextInt();

        double valorPorKWh;
        switch (tipoCliente) {
            case 1:
                valorPorKWh = 0.60;
                break;
            case 2:
                valorPorKWh = 0.48;
                break;
            case 3:
                valorPorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                leitor.close();
                return;
        }

        System.out.println("Informe o consumo em kWh: ");
        double consumoKWh = leitor.nextDouble();

        ContaDeLuz contaDeLuz = new ContaDeLuz(tipoCliente, valorPorKWh);
        double valorConta = contaDeLuz.calcularConta(consumoKWh);

        System.out.println("Valor da conta de luz: R$" + valorConta);

        leitor.close();
    }
}
