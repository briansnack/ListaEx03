import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{

            System.out.println("Valor da compra: ");
            double valorCompra = leitor.nextDouble();
            
            Prestacao prestacao = new Prestacao();
            prestacao.setPrestacao(valorCompra);

            double valorPrestacao = prestacao.calcularPrestacao();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String prestacaoFormatada = formatador.format(valorPrestacao); 

            System.out.println("Valor da prestação: " + prestacaoFormatada);

            leitor.close();
        }
    }
}
