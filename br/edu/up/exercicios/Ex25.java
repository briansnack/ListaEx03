import java.util.Scanner;

public class Ex25 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome do estudante: ");
        String nome = leitor.nextLine();

        System.out.println("Informe o número de matrícula do estudante: ");
        int matricula = leitor.nextInt();

        System.out.println("Informe a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Informe a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacao = leitor.nextDouble();

        System.out.println("Informe a nota do exame final (0 a 10): ");
        double notaExame = leitor.nextDouble();

        CalcularNotaFinal1 calcularNotaFinal = new CalcularNotaFinal1(notaLaboratorio, notaAvaliacao, notaExame);
        double notaFinal = calcularNotaFinal.calcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExame);

        Classificacao classi = new Classificacao(notaFinal);

        String classificacao = classi.determinarClassificacao();

        System.out.println("Nome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        leitor.close();
    }
}
