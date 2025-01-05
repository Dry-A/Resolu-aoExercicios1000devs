package estruturaDeDados.collections.gerenciadorContatov1;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Main {

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

        private static void incluirContato() {
            System.out.print("Digite o nome: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = teclado.nextLine();

            System.out.print("Digite o email: ");
            String email = teclado.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, telefone, email);
            listaContatos.add(novaPessoa);
            System.out.println("Contato incluído com sucesso!");
        }

        private static void alterarContato() {
            System.out.print("Digite o ID do contato a ser alterado: ");
            int id = teclado.nextInt();
            teclado.nextLine(); // limpeza buffer

            limparTela();

            //busca a pessoa especificada pelo id
            Pessoa pessoa = encontrarContatoPorId(id);

            if (pessoa != null) {

                System.out.print("Digite o novo nome (ou deixe em branco para manter): ");
                String nome = teclado.nextLine();
                //metodo isBlank retorna true se a string estiver vazia
                //é equivalente a fazer nome.equals("");
                if (!nome.isBlank())
                    pessoa.setNome(nome);

                System.out.print("Digite o novo telefone (ou deixe em branco para manter): ");
                String telefone = teclado.nextLine();
                if (!telefone.isBlank())
                    pessoa.setTelefone(telefone);

                System.out.print("Digite o novo email (ou deixe em branco para manter): ");
                String email = teclado.nextLine();
                if (!email.isBlank())
                    pessoa.setEmail(email);

                System.out.println("Contato alterado com sucesso!");
            } else {
                System.out.println("Contato não encontrado.");
                pausa();
            }
        }

        private static void consultarContatos() {
            //metodo isEmpty verifica se a lista esta vazia
            if (listaContatos.isEmpty()) {
                System.out.println("Nenhum contato cadastrado.");
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
            teclado.nextLine(); // Consumir quebra de linha

            //encontra o contato
            Pessoa pessoa = encontrarContatoPorId(id);

            //excluir o contato
            if (pessoa != null) {
                listaContatos.remove(pessoa);
                System.out.println("Contato excluído com sucesso!");
            } else {
                System.out.println("Contato não encontrado.");
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


        private static void limparTela(){
            try {
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    new ProcessBuilder("clear").inheritIO().start().waitFor();

            } catch (IOException | InterruptedException ex) {}
        }

        private static void pausa(){
            System.out.println("\nTecle ENTER para continuar.");
            teclado.nextLine();
        }
}
