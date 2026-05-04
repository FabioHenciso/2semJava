package VetorFuncao;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args){

        double[] salario = new double[5];
        ResultadoSalario r = salarioMedia(salario);

        System.out.println("Media "+ r.media);
        System.out.println("Acima da media " + r.acima);
        System.out.println("Abaixo da media " + r.abaixo);
        System.out.println("Exatamente na media " + r.iguais);




    }
    public static ResultadoSalario salarioMedia(double[] salario){
        Scanner sc = new Scanner(System.in);


        double soma = 0;
        for(int i = 0; i<5; i++){
            System.out.println("Digite seu salario ");
            salario[i] = sc.nextDouble();
            soma += salario[i];
        }
        ResultadoSalario r = new ResultadoSalario();
        double media = soma / 5;
        r.media = media;
        for(int i =0; i<5; i++){
            if (salario[i] < media){
                r.abaixo += 1;
            }
            else if (salario[i] > media) {
                r.acima += 1;
            }
            else if (salario[i] == media) {
                r.iguais += 1;

            }
        }
        return r;

    }


    static class ResultadoSalario {
        static double media = 0;
        static int acima = 0;
        static int abaixo = 0;
        static int iguais = 0;
    }
}
