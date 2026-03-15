package exerciciosFor;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "prod";
        int vlr = 0;
        String continua = "S";
        while(continua.equalsIgnoreCase("S")){
            System.out.println("Qual o nome do Produto: ");
            String nome = sc.next();
            System.out.println("Qual o preço do produto: ");
            int preco = sc.nextInt();

            if (preco > vlr){
                vlr = preco;
                name = nome;
            }

            System.out.println("Deseja continuar? (S/N) ");
            continua = sc.next();

        }
        System.out.println("O produto mais caro foi: " + name + ",  Valor: " + vlr);

    }
}
