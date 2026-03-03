import java.util.Scanner;

public class CalculadoraDeEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do cliente:");
        String nome = sc.nextLine();

        System.out.println("Informe a leitura anterior do medidor (kWh):");
        int leituraAnterior = sc.nextInt();

        System.out.println("Informe a leitura atual do medidor (kWh):");
        int leituraAtual = sc.nextInt();

        int consumo = leituraAtual - leituraAnterior;
        double valorKwh = 0.60;
        double valorBruto = consumo * valorKwh;

        double adicionalBandeira = 0;
        String corBandeira = "";

        if (consumo <= 100) {
            corBandeira = "Verde";
            adicionalBandeira = 0.0;
        }
        else if (consumo > 100 && consumo <= 200) {
            corBandeira = "Amarela";
            adicionalBandeira = 2.00;
        }
        else if (consumo > 200 && consumo <= 300) {
            corBandeira = "Vermelha";
            adicionalBandeira = 5.00;
        }
        else {
            corBandeira = "Preta";
            adicionalBandeira = 10.00;
        }

        double valorTotal = valorBruto + adicionalBandeira;

        System.out.println("Cliente: " + nome);
        System.out.println("Consumo total: " + consumo + " kWh");
        System.out.println("Bandeira: " + corBandeira);
        System.out.println("Valor total a pagar: R$ " + valorTotal);

    }
}
