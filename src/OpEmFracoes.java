import java.util.Scanner;

public class OpEmFracoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o numerador da 1ª fração: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o denominador da 1ª fração: ");
        int d1 = sc.nextInt();


        System.out.print("\nDigite o numerador da 2ª fração: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o denominador da 2ª fração: ");
        int d2 = sc.nextInt();


        System.out.print("\nEscolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int numerador = 0;
        int denominador = 0;

        switch (op) {
            case '+':
                numerador = n1 * d2 + n2 * d1;
                denominador = d1 * d2;
                break;

            case '-':
                numerador = n1 * d2 - n2 * d1;
                denominador = d1 * d2;
                break;

            case '*':
                numerador = n1 * n2;
                denominador = d1 * d2;
                break;

            case '/':
                numerador = n1 * d2;
                denominador = d1 * n2;
                break;

            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("\nResultado:");
        System.out.println(numerador + "/" + denominador);

        double decimal = (double) numerador / denominador;
        System.out.println("Valor decimal: " + decimal);

    }
}