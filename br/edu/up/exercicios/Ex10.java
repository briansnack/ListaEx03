import java.util.Scanner;
public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int[] idade = new int[5];
        Pessoa pessoa = new Pessoa();

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Idade da pessoa " + (i+1) + ": ");
            idade[i] = leitor.nextInt();
            pessoa.verificarIdade(idade[i]);
        }
        leitor.close();
    }
}
