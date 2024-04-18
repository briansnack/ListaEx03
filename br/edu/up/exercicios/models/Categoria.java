public class Categoria {
    private int idade;
    private String grupoRisco;

    public Categoria(int idade, String grupoRisco) {
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(String grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public int determinarCategoria(int idade, String grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    return 1;
                case "médio":
                    return 2;
                case "medio":
                    return 2;
                case "alto":
                    return 3;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    return 2;
                case "médio":
                    return 3;
                case "medio":
                    return 3;
                case "alto":
                    return 4;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    return 3;
                case "médio":
                    return 4;
                case "medio":
                    return 4;
                case "alto":
                    return 5;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    return 4;
                case "médio":
                    return 5;
                case "medio":
                    return 5;
                case "alto":
                    return 6;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    return 7;
                case "médio":
                    return 8;
                case "medio":
                    return 8;
                case "alto":
                    return 9;
            }
        }

        return -1; 
    }
}
