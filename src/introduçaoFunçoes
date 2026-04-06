import java.util.Scanner;

public class IntroduçaoFunçoes {

    public static double calculaAreaRetangulo(double base, double alt){

        return (base * alt);

    }
    public static float conversorTemp ( float temp){
        float fah = (float) (temp * 1.8 + 32);
        return fah;
    }

    public static boolean VerifPar (int num){
        return ( num % 2 ==0 );
    }

    public static String media (int nota){
        if(nota >=6){
            return "Aprovado";
        }
        else if (nota == 4) {
            return "Recuperaçao";

        }
        else return "Reprovado";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("O que deseja fazer: ");
        System.out.println("1 - calcular Area do retangulo.");
        System.out.println("2 - Verificador de Paridade ");
        System.out.println("3 - Conversor de temperatura ");
        System.out.println("4 - Sistema de Notas");
        int op = sc.nextInt();

        switch (op) {

            case 1:
            System.out.println("Digite o valor da base: ");
            double base = sc.nextDouble();
            System.out.println("Digite o valor da Altura: ");
            double alt = sc.nextDouble();

            double result = calculaAreaRetangulo(base, alt);
            System.out.println("A area do retangulo é " + result);

            break;

            case 2:
                System.out.println("Digite um numero inteiro");
                int num = sc.nextInt();
                System.out.println("Considere True: Numero Par\nFalse: numero Impar\n");
                System.out.println(VerifPar(num));

                break;

            case 3:
                System.out.println("Digite a temperatura em - C°");
                float temp = sc.nextFloat();

                float tempf = conversorTemp(temp);
                System.out.println("A temperatura é " + tempf + "f");
                break;

            case 4:
                System.out.println("Digite Sua nota");
                int nota = sc.nextInt();

                String resulta = media(nota);
                System.out.println(resulta);


        }
    }
}
