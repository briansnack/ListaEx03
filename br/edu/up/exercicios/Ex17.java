import java.util.Scanner;

public class Ex17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.println("Salário atual: ");
        double salario = leitor.nextDouble();

        System.out.println("Salário Mínimo: ");
        double salarioMinimo = leitor.nextDouble();

        Reajuste reajusteSalario = new Reajuste();
        reajusteSalario.setSalario(salario);
        reajusteSalario.setSalarioMinimo(salarioMinimo);
        
        double reajuste = reajusteSalario.calcularReajuste();
        double novoSalario = salario + reajuste;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

        double aumentoFolha = reajuste;

        System.out.println("Aumento na folha de pagamento da empresa: R$" + aumentoFolha);

        leitor.close();
    }
}
