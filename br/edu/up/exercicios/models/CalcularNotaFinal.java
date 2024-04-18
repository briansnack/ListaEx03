public class CalcularNotaFinal {
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExame;

    public CalcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExame = notaExame;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public double getNotaExame() {
        return notaExame;
    }

    public void setNotaExame(double notaExame) {
        this.notaExame = notaExame;
    }

    public double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
    final double PESO_LABORATORIO = 2;
    final double PESO_AVALIACAO = 3;
    final double PESO_EXAME = 5;

    double notaFinal = (notaLaboratorio * PESO_LABORATORIO + notaAvaliacao * PESO_AVALIACAO + notaExame * PESO_EXAME) / (PESO_LABORATORIO + PESO_AVALIACAO + PESO_EXAME);
    
    return notaFinal;
}
}