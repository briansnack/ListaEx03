import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        PrecoProdutos precosProdutos = new PrecoProdutos();

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Informe o preço de custo do produto " + (i + 1) + ":");
            double precoCusto = leitor.nextDouble();

            System.out.println("Informe o preço de venda do produto " + (i + 1) + ":");
            double precoVenda = leitor.nextDouble();

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;

            precosProdutos.verificarLucroPrejuizo(precoCusto, precoVenda);
        }

        precosProdutos.mostrarMediaPrecos(somaPrecoCusto / 40, somaPrecoVenda / 40);

        leitor.close();
    }
}

