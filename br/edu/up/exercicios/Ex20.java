import java.util.Scanner;

public class Ex20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nível do professor(1, 2 ou 3): ");
        int nivel = leitor.nextInt();

        System.out.println("Horas trabalhadas: ");
        double horas = leitor.nextDouble();

        double salario = SalarioProfessor.calcularSalario(nivel, horas);

        System.out.println("Salário do professor: " + salario);

        leitor.close();
    }
}
