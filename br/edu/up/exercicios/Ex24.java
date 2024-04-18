import java.util.Scanner;

public class Ex24 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Informe a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacao = leitor.nextDouble();

        System.out.println("Informe a nota do exame final (0 a 10): ");
        double notaExame = leitor.nextDouble();

        CalcularNotaFinal calcularNotaFinal = new CalcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExame);

        double notaFinal = calcularNotaFinal.calcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExame);

        System.out.println("A nota final do estudante é: " + notaFinal);

        leitor.close();
    }
}
