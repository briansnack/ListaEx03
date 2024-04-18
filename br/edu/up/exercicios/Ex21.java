import java.util.Scanner;

public class Ex21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Idade do atleta: ");
        int idade = leitor.nextInt();

        Idade idade2 = new Idade(); 

        String idadeAtleta = idade2.idadeAtleta(idade);
        System.out.println(idadeAtleta);

        leitor.close();
    }
}
