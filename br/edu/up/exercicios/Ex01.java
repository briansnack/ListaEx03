import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            
            System.out.println("Nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.println("Nota 1: ");
            double nota1 = leitor.nextDouble(); 

            System.out.println("Nota 2: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Nota 3: ");
            double nota3 = leitor.nextDouble();

            Media media = new Media();
            media.setNotas(nota1, nota2, nota3);

            double mediaNota = media.calcularMedia();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String mediaFormatada = formatador.format(mediaNota);

            System.out.println("Nome: " + nome + " Média: " + mediaFormatada);


            leitor.close();
        }
    }
}
