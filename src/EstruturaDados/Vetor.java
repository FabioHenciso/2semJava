package EstruturaDados;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int []vet = new int[7];
        int aux = 0;
        for (int i = 0; i < vet.length; i++){
            System.out.println("posição "+ i);
            vet[i] = sc.nextInt();

        }

        for (int i = 0; i < vet.length; i++){

            System.out.println(" " + vet[i] + " ");
            if (vet[i] > vet[i + 1]){
                aux = vet[i];
                vet[i] = vet[i + 1];
                vet[i+1] = aux;
            }
        }
    }
}
