package VetorFuncao;

import java.util.Scanner;

public class UniaoVetores {
    public static void main ( String[] args){

        int[] num1 = new int[5];
        int [] num2 = new int[5];
        int[] juncao = new int[10];
        juncaoVetor(num1, num2, juncao);
    }

    public static void juncaoVetor (int[] num1, int[] num2, int[] juncao){
        Scanner sc = new Scanner(System.in);

        int j = 0;
        for (int i =0; i < 5; i++){
            num1[i] = (int) (Math.random() * 99);
        }
        for (int i = 0; i<5; i++){
            num2[i] = (int) (Math.random() * 99);
        }
        for ( int i = 0; i <5; i++){
            juncao[j] = num1[i];
            j++;
        }
        for (int i = 0; i<5; i++){

            juncao[j] = num2[i];
            j++;
        }

        System.out.println("Vetor 1:");
        for (int i = 0; i < 5; i++){
            System.out.print(num1[i] + " ");
        }

        System.out.println("\nVetor 2:");
        for (int i = 0; i < 5; i++){
            System.out.print(num2[i] + " ");
        }

        System.out.println("\n\nVetor Junção:");
        for (int i = 0; i < 10; i++){
            System.out.print(juncao[i] + " ");
        }


    }
}
