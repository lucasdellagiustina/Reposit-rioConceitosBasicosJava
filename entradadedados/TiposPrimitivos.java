package entradadedados;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeAluno = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f%n", nomeAluno, nota);
    }
}    
