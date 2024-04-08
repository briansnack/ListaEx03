public class Concessionaria {
    public int totalAte2000;
    public int totalGeral;
    public double totalDesconto;
    
    public Concessionaria() {
        totalAte2000 = 0;
        totalGeral = 0;
        totalDesconto = 0;
    }

    public void calcularDesconto(int ano, double valor) {
        double desconto;
        if (ano <= 2000) {
            desconto = valor * 0.12;
            totalAte2000++;
        } else {
            desconto = valor * 0.07;
        }
        totalDesconto += desconto;
        totalGeral++;
        double valorAPagar = valor - desconto;
        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Valor a ser pago: " + valorAPagar);
    }

    public void mostrarTotais() {
        System.out.println("Total de carros até 2000: " + totalAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
        System.out.println("Total de descontos concedidos: " + totalDesconto);
    }
}