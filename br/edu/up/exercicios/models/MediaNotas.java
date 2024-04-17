public class MediaNotas {
    private double[] notas;

    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
