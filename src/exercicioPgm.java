import java.util.Scanner;

public class exercicioPgm
{
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float desc15 = 0.15F;
        System.out.println("Informe Seu Primeiro nome ");
        String nome = sc.next();
        System.out.println("Informe o valor da compra ");
        float valor = sc.nextFloat();

        int op;
        do {
            System.out.println("Qual a forma de pagamento \n 1. A Vista (15% de desconto) " +
                    "\n 2. Parcelado no Cartão (Ate 5x sem juros.)" +
                    "\n 3. Creditario da loja ( 10 parcelas com juros de 2% ao mês sobre o valor bruto.)" +
                    "\n 0. Cancelar Venda.");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    valor -= (valor * desc15);
                    System.out.println("Valor Final Pagamento A vista (15% desconto) " + valor);
                    break;
                case 2:
                    System.out.println("Em quantas parcelas deseja ( 1x a 5x). ");
                    int parc = sc.nextInt();
                    while (parc < 1 || parc > 5) {
                        System.out.println("Numero de parcelas invalido!! Tente novamente");
                        parc = sc.nextInt();
                    }
                    for (int i = 1; i <= parc; i++) {
                        System.out.println("Valor Da " + i + "a. parcela: " + valor / parc);
                    }
                case 3:
                    System.out.println("2% ao mês de juros, 10 parcelas de " + ((valor * 1.20) / 10));
                    break;
                case 4:
                    System.out.println("Programa sera encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida!!");
            }
        }
        while (op != 4);
    }
}
