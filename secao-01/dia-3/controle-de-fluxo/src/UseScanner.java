import java.util.Scanner;

class UseScanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o seu nome: ");
    String nome = scanner.next();
    System.out.println("Boas-vindas, " + nome + "!");

    System.out.print("Entre com o primeiro número: ");
    String input1 = scanner.next();
    System.out.print("Entre com o segundo número: ");
    String input2 = scanner.next();

    int n1 = Integer.parseInt(input1);
    int n2 = Integer.parseInt(input2);

    int resultado = n1 + n2;
    System.out.println("O resultado da soma é: " + resultado);
    scanner.close();
  }
}