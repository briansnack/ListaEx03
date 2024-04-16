import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Valor do produto: ");
            double produto = leitor.nextDouble();

            System.out.println("Acréscimo %: ");
            double acrescimo = leitor.nextDouble();

            ValorVenda valorVenda = new ValorVenda();
            valorVenda.setVendas(produto, acrescimo);

            double valorTotal = valorVenda.calcularVenda();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String vendaFormatada = formatador.format(valorTotal);

            System.out.println("Valor de venda: " + vendaFormatada);
            
            leitor.close();
        }
    }
}
