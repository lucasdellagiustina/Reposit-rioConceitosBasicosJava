package somanumero;

import java.util.Scanner;
public class SomadorDeNumeros {
     public static void main (String[] args){
          Scanner scanner = new Scanner(System.in);
          int num1, num2, soma;

          System.out.println("Digite o Primeiro número para a soma: ");
          num1 = scanner.nextInt();

          System.out.println("Digite o Segundo número para a soma: ");
          num2 = scanner.nextInt();

          soma = num1 + num2;

          System.out.println(soma + " é a soma de " + num1 + " e " + num2);
          scanner.close(); //Necessário fechar o scanner para evitar vazamento de memória
     }
}


