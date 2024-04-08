import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Valor do produto: ");
            double produto = leitor.nextDouble();

            System.out.println("Acréscimo %: ");
            double acrescimo = leitor.nextDouble();

            double valorVenda = ValorVenda.calcularVenda(produto, acrescimo);

            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Valor de venda: " + formatador.format(valorVenda));
            
            leitor.close();
        }
    }
}
