package estruturaDeDados.collections.gerenciadorContatov2;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Pessoa {

    public static int contador;
    private final int id;
    private String nome;
    private ArrayList<Telefone> telefones = new ArrayList<Telefone>();
    private String email;

    //construtor da classe pessoa
    public Pessoa(String nome,  ArrayList<Telefone> telefones, String email) {
        contador++;
        this.id = contador;
        setNome(nome);
        this.telefones = telefones;
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        //aqui implementariamos as validações necessárias
        //antes de inserir o nome
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String ddd, String telefone) {
        //aqui implementariamos as validações necessárias
        //antes de inserir o telefone
        telefones.add(new Telefone(ddd, telefone));
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setEmail(String email) {
        //aqui implementariamos as validações necessárias
        //antes de inserir o email
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //cria o método to string utilizado para converter o objeto para string
    //quando for necessário imprimir os dados do objeto na tela por outra parte do nosso
    //programa
    @Override
    public String toString() {
        String strTelefones = "";

        if (!telefones.isEmpty()) {
            for (Telefone telefone : telefones) {
                strTelefones += telefone.toString() + ", ";
            }
        }

        return "ID: " + id + ", Nome: " + nome + ", Telefones: " +  StringUtils.removeEnd(strTelefones, ", ") + ", Email: " + email;
    }
}
