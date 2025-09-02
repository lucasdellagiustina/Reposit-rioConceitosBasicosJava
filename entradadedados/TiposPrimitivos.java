package entradadedados;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f%n", nomeAluno, nota); // Exemplo: Paulo, 8;50
        teclado.close(); // precisa fechar o scanner para evitar vazamento de memória
    }
}    
