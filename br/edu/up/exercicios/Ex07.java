import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Custo de fabricação: ");
            double custo = leitor.nextDouble(); 

            double valorFinal = VendaCarro.calcularVendaCarro(custo);

            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Valor de venda do carro: " + formatador.format(valorFinal));

            leitor.close();
        }
    }
}
