import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{

            System.out.println("Quantidade em dólar: ");
            double qtdDolar = leitor.nextDouble();

            System.out.println("Cotação do dólar: ");
            double valorDolar = leitor.nextDouble();

            Conversao conversao = new Conversao();
            conversao.setConversao(qtdDolar, valorDolar);

            double conversaoFinal = conversao.convesaoDolar();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String conversaoFormatada = formatador.format(conversaoFinal);

            System.out.println("Quantidade de reais disponíveis: " + conversaoFormatada);

            leitor.close();
        }
    }
}
