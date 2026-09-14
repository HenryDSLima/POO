import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        
        double soma = 0;
        double maiorNota = -1;
        double menorNota = 11;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            soma += notas[i];
            
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\n-Resultado-");
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        
        double media = soma / notas.length;
        
        System.out.println("\nMédia: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Estudantes com nota >= 7.0: " + aprovados);

        scanner.close();
    }
}