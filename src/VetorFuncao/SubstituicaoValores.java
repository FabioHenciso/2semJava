package VetorFuncao;

import java.util.Scanner;

public class SubstituicaoValores {
    public static void main (String[] args){


        int[]num = new int[10];
        substituirValores(num);
    }

    public static void substituirValores (int[] num){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("\nDigite um numero inteiro ");
            num[i] = sc.nextInt();
            if (num[i] < 0 ){
                num[i] = 0;
            }
        }
        for (int i = 0; i <10; i++){
            System.out.println(num[i]);
        }

    }
}
