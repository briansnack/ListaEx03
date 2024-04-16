import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Distância total percorrida: ");
            double distancia = leitor.nextDouble();
            System.out.println("Combustivel gasto: ");
            double combustivel = leitor.nextDouble();

            ConsumoMedio consumoMedio = new ConsumoMedio();
            consumoMedio.setConsumo(distancia, combustivel);

            double mediaConsumo = consumoMedio.calcularConsumo();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String mediaFormatada = formatador.format(mediaConsumo);

            System.out.println("Consumo médio " + mediaFormatada + " kms por litro");

            leitor.close();
        }
    }
}
