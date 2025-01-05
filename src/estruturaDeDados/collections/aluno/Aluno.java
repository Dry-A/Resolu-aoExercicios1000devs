package estruturaDeDados.collections.aluno;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int idade;
    private String email;
    private ArrayList<Nota> notas;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    //regra para nome e sobrenome
    public void setNome(String nome) {
        if(nome.contains(" ")){

            return;
        }else{
            System.out.println("nome nao aceito");
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", notas=" + notas +
                '}';
    }

}
