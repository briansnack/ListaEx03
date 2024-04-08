public class CalcularNotaFinal {

public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
    // Definir os pesos
    final double PESO_LABORATORIO = 2;
    final double PESO_AVALIACAO = 3;
    final double PESO_EXAME = 5;

    double notaFinal = (notaLaboratorio * PESO_LABORATORIO + notaAvaliacao * PESO_AVALIACAO + notaExame * PESO_EXAME) / (PESO_LABORATORIO + PESO_AVALIACAO + PESO_EXAME);
    
    return notaFinal;
}
}