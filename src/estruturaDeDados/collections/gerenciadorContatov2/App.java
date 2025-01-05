package estruturaDeDados.collections.gerenciadorContatov2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //Aqui definimos a lista contatos e teclado como variaveis globais
    //pois já estamos utilizando a orientação a objetos para ter uma melhor
    //separação não sendo necessário termos tanta proteção às variaveis do
    //programa principal
    private static ArrayList<Pessoa> listaContatos = new ArrayList<Pessoa>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //guarda a opcao selecionada pelo usuario no menu
        int opcao;

        do {
            limparTela();
            //obtem a opcao desejada pelo usuario
            opcao = obterEscolhaMenu();

            //executa a funcionalidade conforme escolhido pelo usuario
            processarEscolhaMenu(opcao);
        } while (opcao != 5);
    }

    private static void processarEscolhaMenu(int opcao){
        switch (opcao) {
            case 1:
                incluirContato();
                pausa();
                break;
            case 2:
                alterarContato();
                break;
            case 3:
                consultarContatos();
                break;
            case 4:
                excluirContato();
                pausa();
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void processarEscolhaMenuAlterarContato(int opcao, Pessoa pessoa){
        switch (opcao) {
            case 1:
                alterarDadosBasicosContato(pessoa);
                pausa();
                break;
            // case 2:
            //  TODO: Implementar a alteração de um telefone existente de um contato
            //     alterarUmTelefone();
            //     break;
            case 3:
                inserirNovoTelefone(pessoa.getTelefones());
                pausa();
                break;
            case 4:
                excluirTelefone(pessoa.getTelefones());
                pausa();
                break;
            case 5:
                System.out.println("Voltar ao menu anterior");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void alterarDadosBasicosContato(Pessoa pessoa){
        System.out.print("\nDigite o novo nome (ou deixe em branco para manter): ");
        String nome = teclado.nextLine();

        //metodo isBlank retorna true se a string estiver vazia
        //é equivalente a fazer nome.equals("");
        if (!nome.isBlank())
            pessoa.setNome(nome);

        System.out.print("Digite o novo email (ou deixe em branco para manter): ");
        String email = teclado.nextLine();
        if (!email.isBlank())
            pessoa.setEmail(email);

        System.out.println("Contato alterado com sucesso!");
    }

    private static int obterEscolhaMenu(){
        int opcao;

        System.out.println("\n--- Menu de Gerenciamento de Contatos ---\n");

        System.out.println("1. Incluir Contato");
        System.out.println("2. Alterar Contato");
        System.out.println("3. Consultar Contatos");
        System.out.println("4. Excluir Contato");
        System.out.println("5. Sair");

        System.out.print("\nEscolha uma opção: ");
        opcao = teclado.nextInt();
        teclado.nextLine(); // Limpeza buffer

        return opcao;
    }

    private static int obterEscolhaMenuAlterarContato(){
        int opcao;

        System.out.println("\n--- Menu Alteração de Contatos ---\n");

        System.out.println("1. Alterar Dados Básicos");
        System.out.println("2. Alterar em Telefone");
        System.out.println("3. Inserir novo Telefone");
        System.out.println("4. Excluir Telefone");
        System.out.println("5. Sair");

        System.out.print("\nEscolha uma opção: ");
        opcao = teclado.nextInt();
        teclado.nextLine(); // Limpeza buffer

        return opcao;
    }

    private static boolean inserirNovoTelefone(ArrayList<Telefone> telefones){
        int resposta;
        System.out.print("Deseja adicionar um contato telefônico [s/n]? ");
        resposta  = teclado.nextLine().toLowerCase().charAt(0);

        if (resposta == 's'){
            telefones.add(obterTelefone());
            System.out.println("\nNovo telefone inserido com sucesso.");
            return true;
        } else{
            System.out.println("\nInserção de novo telefone cancelado.");
            return false;
        }
    }

    private static void incluirContato() {
        ArrayList<Telefone> telefones = new ArrayList<Telefone>();

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o email: ");
        String email = teclado.nextLine();

        boolean resposta;

        do {
            resposta = inserirNovoTelefone(telefones);
        } while (resposta);

        Pessoa novaPessoa = new Pessoa(nome, telefones, email);
        listaContatos.add(novaPessoa);

        System.out.println("\nContato incluído com sucesso!");
    }

    private static Telefone obterTelefone(){
        String ddd, telefone;

        System.out.print("Digite o ddd do telefone: ");
        ddd = teclado.nextLine();

        System.out.print("Digite o telefone: ");
        telefone = teclado.nextLine();

        return new Telefone(ddd, telefone);

    }

    private static void alterarContato() {
        System.out.print("Digite o ID do contato a ser alterado: ");
        int id = teclado.nextInt();
        teclado.nextLine(); // limpeza buffer

        limparTela();

        //busca a pessoa especificada pelo id
        Pessoa pessoa = encontrarContatoPorId(id);

        if (pessoa != null) {
            //imprime os dados do contato

            System.out.println(pessoa);
            //obtem a opcao desejada pelo usuario
            int opcao = obterEscolhaMenuAlterarContato();

            //executa a funcionalidade conforme escolhido pelo usuario
            processarEscolhaMenuAlterarContato(opcao, pessoa);
        } else {
            System.out.println("\nContato não encontrado.");
            pausa();
        }
    }

    private static void consultarContatos() {
        //metodo isEmpty verifica se a lista esta vazia
        if (listaContatos.isEmpty()) {
            System.out.println("\nNenhum contato cadastrado.");
        } else {
            System.out.println("\n--- Lista de Contatos ---");
            for (Pessoa pessoa : listaContatos) {
                System.out.println(pessoa);
            }
        }

        pausa();
    }

    private static void excluirContato() {
        //obtem o id do contato;
        System.out.print("Digite o ID do contato a ser excluído: ");
        int id = teclado.nextInt();
        teclado.nextLine(); // limpeza do buffer

        //encontra o contato
        Pessoa pessoa = encontrarContatoPorId(id);

        //excluir o contato
        if (pessoa != null) {
            listaContatos.remove(pessoa);
            System.out.println("\nContato excluído com sucesso!");
        } else {
            System.out.println("\nContato não encontrado.");
        }
    }

    private static Pessoa encontrarContatoPorId(int id) {
        //varre o array list para encontrar o id pesquisado
        for (Pessoa pessoa : listaContatos) {
            if (pessoa.getId() == id) {
                //encontrou retorna o objeto pessoa
                return pessoa;
            }
        }
        //se chegou até aqui não existe este id
        return null;
    }

    private static void excluirTelefone(ArrayList<Telefone> telefones){
        // Verifica se a pessoa tem telefones cadastrados
        if (telefones.isEmpty()) {
            System.out.println("\nNão há telefones cadastrados para esta pessoa.");
            return;
        }

        int idTelefone;
        System.out.print("Digite o ID do telefone a ser excluído: ");
        idTelefone = teclado.nextInt();
        teclado.nextLine(); //limpeza buffer


        boolean encontrado = false;
        for (int i = 0; i < telefones.size(); i++) {
            Telefone telefone = telefones.get(i);

            // Se o telefone encontrado tiver o id correspondente, remove-o
            if (telefone.getId() == idTelefone) {
                telefones.remove(i);
                System.out.println("\nTelefone com ID " + idTelefone + " foi removido.");
                encontrado = true;
                break;
            }
        }

        // Caso não tenha encontrado o telefone
        if (!encontrado) {
            System.out.println("\nTelefone com ID " + idTelefone + " não encontrado.");
        }
    }

    private static void pausa(){
        System.out.println("\nTecle ENTER para continuar.");
        teclado.nextLine();
    }

    private static void limparTela(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();

        } catch (IOException | InterruptedException ex) {}
    }
}
