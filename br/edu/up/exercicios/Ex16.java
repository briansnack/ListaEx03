import java.util.Scanner;

public class Ex16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

            System.out.println("Informe o salário de cada funcionário:");
            Funcionario[] funcionarios = new Funcionario[5];

            for (int i = 0; i < funcionarios.length; i++) {
                System.out.print("Salário do funcionário " + (i + 1) + ": R$");
                double salario = leitor.nextDouble();
                funcionarios[i] = new Funcionario(salario);
            }

            for (int i = 0; i < funcionarios.length; i ++) {
                Funcionario funcionario = funcionarios[i];
                double reajuste = funcionario.calcularReajuste();
                if (reajuste > 0) {
                    System.out.println("Reajuste para o funcionário " + (i+1) + ": " + " R$" + reajuste);
                }
            }
            leitor.close();
        }
    }

