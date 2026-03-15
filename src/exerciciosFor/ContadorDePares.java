package exerciciosFor;

import java.util.Scanner;

public class ContadorDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite inferior ");
        int infe = sc.nextInt();
        System.out.println("Digite o limite superior ");
        int supe = sc.nextInt();

        for (int i = infe; i <= supe; i++){

            if (i % 2 == 0){
                System.out.println(+ i);
            }
        }
    }
}
