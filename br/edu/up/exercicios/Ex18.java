import java.util.Scanner;

public class Ex18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.print("Idade do funcionário: ");
        int idade = leitor.nextInt();

        System.out.print("Sexo do funcionário (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.print("Salário fixo do funcionário: ");
        double salarioFixo = leitor.nextDouble();

        Funcionario1 funcionario = new Funcionario1(nome, idade, sexo, salarioFixo);

        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: R$" + salarioLiquido);

        leitor.close();
        
    }
}
