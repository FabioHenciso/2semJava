import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double num1 = entrada.nextDouble();

        System.out.println("Informe a operação: ( +, -, *, / ");
        char op = entrada.next().charAt(0);

        System.out.println("Informe o segundo numero:");
        double num2 = entrada.nextDouble();

        if (op == '+'){
            System.out.println("Resultado: " + (num1 + num2));
        }
        else if (op == '-') {
            System.out.println("Resultado: " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.println("Resultado: " + (num1 * num2));
        }
        else if (op == '/') {
            System.out.println("Resultado: " + (num1 / num2));

        }

    }
    }
