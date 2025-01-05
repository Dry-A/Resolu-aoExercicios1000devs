package estruturaDeDados.collections.gerenciadorContatov2;

public class Telefone {

    public static int contador;
    int id;
    private final String ddd;
    private final String telefone;

    public int getId() {
        return id;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public Telefone(String ddd, String telefone) {
        contador++;
        id = contador;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + id + " (" + ddd + ") " + telefone;
    }
}
