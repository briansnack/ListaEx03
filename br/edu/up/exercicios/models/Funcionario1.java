class Funcionario1 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario1(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }

    private double calcularAbono() {
        double abono;
        if (sexo == 'M' || sexo == 'm') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else { 
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }
        return abono;
    }
}