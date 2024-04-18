public class CalcularNotaFinal1 {
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExame;
    
    public CalcularNotaFinal1(double notaLaboratorio, double notaAvaliacao, double notaExame) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExame = notaExame;
    }
    public double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
        final double peso_laboratorio = 2;
        final double peso_avaliacao = 3;
        final double peso_exame = 5;

        double notaFinal = (notaLaboratorio * peso_laboratorio + notaAvaliacao * peso_avaliacao + notaExame * peso_exame) / (peso_laboratorio + peso_avaliacao + peso_exame);
   
        return notaFinal;
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
}

