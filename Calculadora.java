import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º numero : ");
        int numero1 = teclado.nextInt();

        System.out.println("Digite o 2º numero : ");
        int numero2 = teclado.nextInt();
        
        System.out.println("Digite 1 para soma,");
        System.out.println("2 para subtracao,");
        System.out.println("3 para multiplicacao ou"); 
        System.out.println("4 para divisao:");
        int escolha = teclado.nextInt();
        switch (escolha) {
            case 1 -> System.out.println("a soma de :" + " "+numero1 + " + " + numero2 +" = "+" "+(numero1+numero2));
            case 2 -> System.out.println("a subtracao de :" +" "+ numero1 + " - " + numero2 +" = "+" "+(numero1-numero2));
            case 3 -> System.out.println("a multiplicacao de :" + " "+numero1 + " * " + numero2 +" = "+" "+(numero1*numero2));
            case 4 -> System.out.println("a divisao de :" +" "+ numero1 + " / " + numero2 +" = "+" "+(numero1/numero2));
            default -> System.out.println("Error");
        }

    }
}
