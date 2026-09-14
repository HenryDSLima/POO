public class Questao05 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Henry de Souza", "860930", "Ciencia da Computacaoo");
        Aluno aluno2 = new Aluno("Ivna Valenca", "860931", "Sistemas de Informaacao");

        System.out.println("-Aluno 1-");
        aluno1.exibirDados();

        System.out.println("\n-Aluno 2-");
        aluno2.exibirDados();
    }
}