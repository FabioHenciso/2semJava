package exerciciosFor;

import java.util.Scanner;

public class Investimentojuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de Deposito: ");
        int depo = sc.nextInt();
        double jurosmes = 0.005;

        System.out.println("Saldo da conta 1° mês: " + depo );

        for (int i = 2; i<=12; i++){

            depo += (depo * jurosmes);
            System.out.println("Saldo da conta " + i + "° mês: " + depo);

        }


    }
}
