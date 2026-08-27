public class Fatorial {
    public static int fat ( int num){

        if ( num == 0){
            return 1;
        }
        else {
            return num * fat(num -1);
        }
    }

    public static void main (String[] args){

        int x = 4;
        int resp = fat(x);
        System.out.println("O fatorial de " + x + " é: " + resp);
    }
}
