package exerciciosFor;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idd = 1;
        int acm = 0;
        int qnt = 0;
        while(idd >= 0){

            System.out.println("Digite a idade do Aluno: ");
            idd = sc.nextInt();
            acm += idd;
            qnt++;
        }

        int media = acm / (qnt -1);
        System.out.println("A media de idade é " + media);

    }
}
