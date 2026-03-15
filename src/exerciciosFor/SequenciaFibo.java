package exerciciosFor;

import java.util.Scanner;

public class SequenciaFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos termos quer ver? " );
        int term = sc.nextInt();
        System.out.println(" 0, 1");
        int a = 0;
        int b = 1;

        for (int i = 3; i <= term; i++){

            int res = a +b;
            System.out.println(+ res);
            a = b;
            b = res;
        }

    }
}
