import java.util.Scanner;

public class ExercicioJavaLanches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Lanches Menu");
        System.out.println("101 - Cachorro Quente (R$ 10,00");
        System.out.println("\n102 - X-Burguer ( R$ 15,00)");
        System.out.println("\n103 - X-Salada (R$ 12,00");

        System.out.println("Selecione o que deseja: ");
        int produto = sc.nextInt();

        switch (produto) {
            case 101:
                System.out.println(" Cachorro Quente (R$ 10,00)");
                produto = 10;
                break;
            case 102:
                System.out.println(" X-Burguer ( R$ 15,00)");
                produto = 15;
                break;
            case 103:
                System.out.println(" X-Salada (R$ 12,00)");
                produto = 12;
                break;
            default:
                System.out.println(" Produto inválido.");
                return;

        }
        System.out.println("Informe sua idade para possivel desconto:");
        int idade = sc.nextInt();

        if (idade < 12) {
            float preco = (produto/2.0f);
            System.out.println("Desconto aplicado ( Menu Kids)");
            System.out.println("\nValor Final: " + preco);
        }
        else if (idade >= 12 && idade <= 60) {
            System.out.println("Sem desconto disponivel.");
            System.out.println("\nValor Final:" + produto);

        }
        else if (idade > 60) {
            float preco = (produto * 0.30f);
            System.out.println("Desconto aplicado ( Melhor idade 30%");
            System.out.println("\nValor Final:" + (produto - preco));
        }
    }
}
