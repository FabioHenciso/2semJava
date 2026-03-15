package exerciciosFor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro ");
        int num = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= 10; i++ ){
            result = i * num;
            System.out.println(i + " X " + num + " = " + result);

        }
    }
}
