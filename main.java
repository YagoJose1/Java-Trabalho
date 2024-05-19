import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Qual numero voce quer saber a tabuada ?");
        int resposta = num.nextInt();
        
        System.out.println("Qual o operador que voce quer ?");
        System.out.println("Digite 1 para tabuada de soma");
        System.out.println("Digite 2 para tabuada de subtracao");
        System.out.println("Digite 3 para tabuada de multiplicacao");
        int escolha = num.nextInt();
        for( int i = 1; i < 11; i++) { 
                switch (escolha) {
                    case 1 -> System.out.println("Tabuada do " + resposta + " : " + resposta + " + " + i + " = " + (resposta+i));
                    case 2 -> System.out.println("Tabuada do " + resposta + " : " + resposta + " - " + i + " = " + (resposta-i));
                    case 3 -> System.out.println("Tabuada do " + resposta + " : " + resposta + " * " + i + " = " + (resposta*i));
                    default -> System.out.println("Error");
                    }
        }
    }

}
