package exerciciosFor;

import java.util.Scanner;

public class LoginESenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Login (Nome de usuario) ");
        String nome = sc.next();
        System.out.println("Digite sua senha ");
        String senha = sc.next();
        while( nome.equalsIgnoreCase(senha) ){
            System.out.println("Login e senha não podem ser iguais!! Tente novamente. ");
            System.out.println("Digite seu Login (Nome de usuario) ");
            nome = sc.next();
            System.out.println("Digite sua senha ");
            senha = sc.next();
        }
        System.out.println("Seu Login: " + nome + "\nSua senha: " + senha);
    }
}
