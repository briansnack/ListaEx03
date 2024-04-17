import java.util.Scanner;
public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int[] idade = new int[5];

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Idade da pessoa " + (i+1) + ": ");
            idade[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < idade.length; i++){
            Pessoa pessoa = new Pessoa();
            pessoa.setIdade(idade[i]);
            pessoa.verificarIdade();
        }
        


        leitor.close();
    }
}
