public class Triangulo {
    public int lado1;
    public int lado2;
    public int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean verificarTriangulo() {
        // Verifica se cada lado é menor que a soma dos outros dois
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isóscele";
        } else {
            return "escaleno";
        }
    }
}