public class SalarioProfessor {
    private int nivel;
    private double horas;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double calcularSalario(int nivel, double horas){
        double salario = 0;
        if (nivel == 1) {
            salario = 12 * horas;
        } else if (nivel == 2){
            salario = 17 * horas;
        } else if (nivel == 3){
            salario = 25 * horas;
        } else {
            return 0;
        }
        return salario;
    }
}
