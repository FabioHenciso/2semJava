package exerciciosFor;

import java.util.Scanner;

public class SomatorioNnumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja somar?");
        int qnt = sc.nextInt();
        int acm = 0;

        for (int i =1; i<= qnt; i++){

            System.out.println("Digite o " + i + "°" + " Numero");
            int num = sc.nextInt();
            acm += num;
        }
        System.out.println("A soma dos numeros é = " + acm);
    }
}
