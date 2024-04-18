public class CalculadoraPesoIdeal {
    
    public static double calcularPesoIdeal(Pessoa1 pessoa) {
        double altura = pessoa.getAltura();
        int idade = pessoa.getIdade();
        char sexo = pessoa.getSexo();

        if (sexo == 'M' || sexo == 'm') {
            if (altura > 1.70) {
                if (idade <= 20)
                    return (72.7 * altura) - 58;
                else if (idade >= 21 && idade <= 39)
                    return (72.7 * altura) - 53;
                else
                    return (72.7 * altura) - 45;
            } else {
                if (idade <= 40)
                    return (72.7 * altura) - 50;
                else
                    return (72.7 * altura) - 58;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (altura > 1.50) {
                if (idade >= 35)
                    return (62.1 * altura) - 45;
                else
                    return (62.1 * altura) - 49;
            } else {
                if (idade >= 35)
                    return (62.1 * altura) - 44.7;
                else
                    return (62.1 * altura) - 49;
            }
        } else {
            System.out.println("Sexo inválido!");
            return -1;
        }
    }
}
