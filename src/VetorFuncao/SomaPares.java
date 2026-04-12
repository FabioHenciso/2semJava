package VetorFuncao;

import java.util.Scanner;

public class SomaPares {
    public static void main (String[] args){

        int par = soma();
        System.out.println("soma dos numeros pares é " + par);

    }

    public static int soma ( ){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[8];
        int acm = 0;

        for ( int i = 0; i < 8; i++){

            System.out.println("Digite o numero ");
            num [i] = sc.nextInt();

            if (num[i] % 2 == 0){
                acm = acm + num[i];
            }
        }
        return acm;
    }

}
