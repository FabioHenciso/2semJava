import java.util.Scanner;

public class exemploFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes quer lançar o dado?");
        int dado = sc.nextInt();

        System.out.println("Qual numero deseja acertar? ( entre 1 e 6) ");
        int n = sc.nextInt();
        while (n < 1 || n > 6){
            System.out.println("Numero deve ser entre 1 e 6.");
            n = sc.nextInt();
        }

        int acerto = 0;
        int qtd = 0;


        for (int i = 1; i <= dado; i++){

            int num = (int) (Math.random() * 6 + 1);

            if (num == n){

                acerto = acerto + 1;
            }
            System.out.println("Numero obtido: " + num);
            qtd++;

        }
        if (qtd > 0) {
            System.out.println("Você acertou o numero " + acerto + " vezes");
            System.out.println("A porcentagem de acerto é: " + (acerto * 100 / qtd) + "%");
        }
    }
}
