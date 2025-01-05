package estruturaDeDados.collections.gerenciadorContatov1;

public class Pessoa {

    public static int contador;
    private int id;
    private String nome;
    private String telefone;
    private String email;

    //construtor da classe pessoa
    public Pessoa(String nome, String telefone, String email) {
        contador++;
        this.id = contador;
        setNome(nome);
        setTelefone(telefone);
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

    public void setTelefone(String telefone) {
        //aqui implementariamos as validações necessárias
        //antes de inserir o telefone
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
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
        return "ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
