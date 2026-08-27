public class Fibonacci {

    public static int fib(int N) {

        if((N == 1) || (N == 2)){
            return 1;
        }
        else {
            return fib(N-1) + fib(N - 2);
        }

    }

    public static void main ( String [] args){

        int x = 6;
        int resp = fib(x);
        System.out.println("Termo: " + resp);
    }
}
