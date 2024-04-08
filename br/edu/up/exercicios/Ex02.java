import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Distância total percorrida: ");
            double distancia = leitor.nextDouble();
            System.out.println("Combustivel gasto: ");
            double combustivel = leitor.nextDouble();

            double consumoMedio = ConsumoMedio.calcularConsumo(distancia, combustivel);
            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Consumo médio " + formatador.format(consumoMedio) + " kms por litro");


            leitor.close();
        }
    }
}
