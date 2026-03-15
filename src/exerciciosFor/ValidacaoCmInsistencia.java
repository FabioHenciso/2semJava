package exerciciosFor;

import java.util.Scanner;

public class ValidacaoCmInsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10 ");
        int nota = sc.nextInt();
        while ( nota < 0 || nota >10){
            System.out.println("Nota invalida!! Digite novamente ");
            nota = sc.nextInt();
        }
        System.out.println("Sua nota é " + nota);
    }
}
