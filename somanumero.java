import java.util.Scanner;

public class somanumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcula a soma dos dois números
        int soma = numero1 + numero2;

        // Exibe a soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}