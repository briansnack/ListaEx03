public class MediaNotas {
    public static double calcularMedia(double[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
