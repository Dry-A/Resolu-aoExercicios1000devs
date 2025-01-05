package estruturaDeDados.collections.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static void imprimirAluno(List<Aluno> lista) {
        //iterar sobre a lista
        System.out.println(" ");
        System.out.println("--**--**--**--**--**--**--**--**--**--");

        System.out.println("Iterando sobre os elementos: ");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Elemento indice: " + i + " " + lista.get(i));

        }

        System.out.println(" ");

        //ou esse for

        System.out.println("Com foreach:  ");

        //nao precisando do indice dos elemntos, se nao deve-se implementar um contador
        for (Aluno aluno : lista) {

            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: " + aluno.idade);
            System.out.println("Email: " + aluno.email);
            System.out.println("Nota 1: "+ aluno.nota1);
            System.out.println("Nota 2: "+ aluno.nota2);
            System.out.println("Nota 3: "+ aluno.nota3);

        }

    }

    //para pegar isso do teclado

    static Aluno obterAluno(Scanner teclado) {

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno");
        aluno.nome = teclado.nextLine();

        System.out.println("Digite a idade do Aluno");
        aluno.idade = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Digite o email do Aluno");
        aluno.email = teclado.nextLine();

        System.out.println("Digite primeira nota do Aluno");
        aluno.nota1 = teclado.nextFloat();

        teclado.nextLine();

        System.out.println("Digite a segunda nota do Aluno");
        aluno.nota2 = teclado.nextFloat();

        teclado.nextLine();

        System.out.println("Digite a terceira nota do Aluno");
        aluno.nota3 = teclado.nextFloat();

        teclado.nextLine();

        return aluno;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        //isso nao é usado na prática, precisade uma estrutura de repeticao
        listaAlunos.add(obterAluno(teclado));
        listaAlunos.add(obterAluno(teclado));

        imprimirAluno(listaAlunos);



    }
}
