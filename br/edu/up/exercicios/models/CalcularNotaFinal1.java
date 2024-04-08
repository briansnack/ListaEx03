public class CalcularNotaFinal1 {
    public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
        final double peso_laboratorio = 2;
        final double peso_avaliacao = 3;
        final double peso_exame = 5;

        double notaFinal = (notaLaboratorio * peso_laboratorio + notaAvaliacao * peso_avaliacao + notaExame * peso_exame) / (peso_laboratorio + peso_avaliacao + peso_exame);
        
        return notaFinal;
    }
}
