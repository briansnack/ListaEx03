import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{

            System.out.println("Quantidade em dólar: ");
            double qtdDolar = leitor.nextDouble();

            System.out.println("Cotação do dólar: ");
            double valorDolar = leitor.nextDouble();

            double conversao = Conversao.convesaoDolar(qtdDolar, valorDolar);

            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Quantidade de reais disponíveis: " + formatador.format(conversao));

            leitor.close();
        }
    }
}
