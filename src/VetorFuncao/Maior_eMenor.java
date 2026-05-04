package VetorFuncao;

import java.util.Scanner;

public class Maior_eMenor {
    public static void main(String[] args){
        int[] num = new int[10];
        int maior = num[0];
        int menor = num[0];
        int posMaior = 0;
        int posMenor = 0;
        maiorMenor(num, maior, menor, posMaior, posMenor);
    }
    public static void maiorMenor (int[] num, int maior, int menor, int posMaior, int posMenor){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10; i++){
            System.out.println("Digite um número ");
            num[i] = sc.nextInt();

        }

        for (int i = 0; i<10; i++){
            if (num[i] > maior){
                maior = num[i];
                posMaior = i;
            }
            if (num[i] < menor){
                menor = num[i];
                posMenor = i;
            }
        }
        System.out.println("O maior número é " + maior + " e esta na posição "+ posMaior);
        System.out.println("O menor número é "+ menor + " e esta na posição "+ posMenor);


    }
}
