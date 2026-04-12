package VetorFuncao;

import java.util.Scanner;

public class Buscador {
    public static void main (String[] args){
        String[] nomes = new String[10];
        int pos = 0;
        String nome = "";
        encontraNomes(nomes, pos, nome);
    }
    
    public static void encontraNomes ( String[] nomes, int pos, String nome){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um Nome ");
            nomes[i] = sc.next();
        }
        System.out.println("Qual nome deseja encontrar? ");
        nome = sc.next();
        for (int i = 0; i <10; i++){
            if (nomes[i].equalsIgnoreCase(nome)){
                
                pos = i;
                System.out.println("Sim, o nome " + nome + " esta na lista. Posiçao " + pos);
                break;
            }
            else  {
                System.out.println("Nome não esta na lista!");

            }
        }

        }
    }

