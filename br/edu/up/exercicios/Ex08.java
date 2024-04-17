import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.println("Notas do aluno ");
            double[] notas = new double[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Nota " + (i + 1) + ": ");
                notas[i] = leitor.nextDouble();
            }

            MediaNotas mediaNotas = new MediaNotas();
            mediaNotas.setNotas(notas);

            double media = mediaNotas.calcularMedia();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String mediaFormatada =  formatador.format(media);

            if (media >= 7) {
                System.out.println(nome + " Média: " + mediaFormatada + " \nAprovado");
            } else if (media >= 5.1 && media <= 6.9) {
                System.out.println(nome + " Média: " + mediaFormatada + " \nRecuperação");
            } else {
                System.out.println(nome + " Média: " + mediaFormatada + " \nReprovado");
            }
            leitor.close();
        }
    }
}
