package VetorFuncao;

import java.util.Scanner;

public class InversorNomes {
    public static void main(String[] args){

        String [] nomes = lerNomes();
        imprimirInvertido(nomes);
    }

    public static String[] lerNomes(){

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i= 0; i <5; i++){
            System.out.println("Digite o " + (i + 1) + "° nome");
            nomes[i] = sc.next();
        }
        return nomes;
    }

    public static void imprimirInvertido(String[]  nomes){
        for (int i = 4; i >= 0; i --){
            System.out.println(nomes[i]);
        }
    }
}

