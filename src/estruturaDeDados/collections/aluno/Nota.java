package estruturaDeDados.collections.aluno;

public class Nota {

    private String descricao;
    private float nota;

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "descricao='" + descricao + '\'' +
                ", nota=" + nota +
                '}';
    }

}
