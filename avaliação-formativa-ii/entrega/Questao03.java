import java.util.Scanner;

public class Questao03 {
    
    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.toUpperCase().contains("SILVA");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("\nQuantidade de caracteres: " + quantidadeCaracteres(nome));
        System.out.println("Nome em maiúsculas: " + formatarNome(nome));
        System.out.println("Contém \"Silva\": " + contemSilva(nome));

        scanner.close();
    }
}