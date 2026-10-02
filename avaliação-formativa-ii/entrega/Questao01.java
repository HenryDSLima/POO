import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            if (nome.trim().isEmpty()) System.out.println("Erro: O nome não pode ser vazio.");
        } while (nome.trim().isEmpty());

        int idade;
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            if (idade < 0) System.out.println("Erro: A idade não pode ser negativa.");
        } while (idade < 0);
        scanner.nextLine();

        String curso;
        do {
            System.out.print("Curso: ");
            curso = scanner.nextLine();
            if (curso.trim().isEmpty()) System.out.println("Erro: O curso não pode ser vazio.");
        } while (curso.trim().isEmpty());

        System.out.println("\n-Dados do estudante-");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);

        scanner.close();
    }
}
