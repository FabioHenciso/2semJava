package exerciciosFor;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int num = sc.nextInt();
        System.out.println("O fatorial de "+ num + " é: ");
        for (int i = num; i>0; i--){

            System.out.println("\n" + i);
        }

    }
}
