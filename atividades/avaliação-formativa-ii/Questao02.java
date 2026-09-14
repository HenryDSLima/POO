import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de estudantes: ");
        int quantidade = scanner.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            scanner.close();
            return;
        }

        double soma = 0;
        double maiorNota = -1;
        double menorNota = 11;
        int aprovados = 0;

        System.out.println();
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            if (nota >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / quantidade;

        System.out.println("\n-Resultado-");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Estudantes aprovados: " + aprovados);

        scanner.close();
    }
}