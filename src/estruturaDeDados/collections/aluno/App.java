package estruturaDeDados.collections.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

        // Método para imprimir os alunos
        static void imprimirAluno(List<Aluno> lista) {
            System.out.println("\n--**--**--**--**--**--**--**--**--**--");
            System.out.println("Iterando sobre os elementos: ");

            // Iterando com foreach
            for (Aluno aluno : lista) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("Notas:");
                for (Nota nota : aluno.getNotas()) {
                    System.out.println("  Descrição: " + nota.getDescricao() + ", Nota: " + nota.getNota());
                }
                System.out.println("--**--**--**--**--**--**--**--");
            }
        }

        // Método para obter as informações de um aluno do teclado
        static Aluno obterAluno(Scanner teclado) {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do Aluno:");
            aluno.setNome(teclado.nextLine());

            System.out.println("Digite a idade do Aluno:");
            aluno.setIdade(teclado.nextInt());
            teclado.nextLine(); // Limpar buffer do teclado

            System.out.println("Digite o email do Aluno:");
            aluno.setEmail(teclado.nextLine());

            // Adicionando notas
            ArrayList<Nota> notas = new ArrayList<>();
            System.out.println("Quantas notas você deseja cadastrar para este aluno?");
            int quantidadeNotas = teclado.nextInt();
            teclado.nextLine(); // Limpar buffer do teclado

            for (int i = 1; i <= quantidadeNotas; i++) {
                Nota nota = new Nota();
                System.out.println("Digite a descrição da nota " + i + ":");
                nota.setDescricao(teclado.nextLine());

                System.out.println("Digite o valor da nota " + i + ":");
                nota.setNota(teclado.nextFloat());
                teclado.nextLine(); // Limpar buffer do teclado

                notas.add(nota);
            }
            aluno.setNotas(notas);

            return aluno;
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            ArrayList<Aluno> listaAlunos = new ArrayList<>();

            System.out.println("Quantos alunos você deseja cadastrar?");
            int quantidadeAlunos = teclado.nextInt();
            teclado.nextLine(); // Limpar buffer do teclado

            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("Cadastro do aluno " + (i + 1) + ":");
                listaAlunos.add(obterAluno(teclado));
            }

            imprimirAluno(listaAlunos);
            teclado.close();
        }
}


