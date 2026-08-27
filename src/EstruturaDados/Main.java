//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int busca(int[] vetor, int inicio, int fim, int x){

        int meio;
        if(inicio > fim){
            return -1;
        }
        else {
            meio = (inicio + fim)/ 2;
            if( vetor[meio] == x){
                return meio;
            }

            else if (x < vetor[meio]){

                return busca(vetor, inicio, meio -1, x);


            }
            else{
                return busca( vetor, meio+1, fim, x);
            }

        }

    }


    public static void main(String[] args) {

        int[] nums = {0,12,22,33,44,55,66,77,88,99};

        int result = busca(nums, inicio : 0, nums.length-1, x:10);
        System.out.println(result);

    }
}