import java.util.Scanner;

public class Recursividade {

    public static double Potencia ( double base, int expoente){

        if (expoente == 0){
            return 1;
        }
        else {

            return base * Potencia(base, expoente - 1);
        }
    }

    public static void main ( String [] args){
        Scanner sc = new Scanner ( System.in);

        System.out.println("Digite a base: ");
        double base = sc.nextDouble();

        System.out.println("Digite o expoente:  ");
        int expoente = sc.nextInt();

        System.out.println("Resultado: " + Potencia(base, expoente));
    }
}
