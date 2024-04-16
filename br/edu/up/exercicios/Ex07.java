import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Custo de fabricação: ");
            double custo = leitor.nextDouble(); 

            VendaCarro vendaCarro = new VendaCarro();
            vendaCarro.setCusto(custo);

            double valorFinal = vendaCarro.calcularVendaCarro();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String vendaFormatada = formatador.format(valorFinal);

            System.out.println("Valor de venda do carro: " + vendaFormatada);

            leitor.close();
        }
    }
}
