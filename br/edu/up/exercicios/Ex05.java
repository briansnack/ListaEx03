import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{

            System.out.println("Valor da compra: ");
            double valorCompra = leitor.nextDouble();
            
            double valorPrestacao = Prestacao.calcularPrestacao(valorCompra);

            DecimalFormat formatador = new DecimalFormat("0.00");
            
            System.out.println("Valor da prestação: " + formatador.format(valorPrestacao));

            leitor.close();
        }
    }
}
