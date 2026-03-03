import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double num1 = entrada.nextDouble();
        System.out.println("Informe o segundo numero:");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação que deseja ( +, -, *, /:");
        char op = entrada.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Resultado: " + (num1 / num2));
                break;

            default:
                System.out.println("Operação invalida");
        }


    }
}