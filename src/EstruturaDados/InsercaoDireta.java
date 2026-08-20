package EstruturaDados;

public class InsercaoDireta {

    public static void main ( String [] args){

        int[] vetor = {25, 57, 48, 37, 12, 92, 86, 33};

        for ( int i = 0; i < vetor.length; i++){
          int atual = vetor[i];

          for ( int j = i - 1; j >=0; j--){

              if ( vetor[j] > atual){
                  vetor[j + 1] = vetor[j];

                  vetor[j]= atual;
              }
          }
        }


        for (int i = 0; i < vetor.length; i++){

            System.out.print(vetor[i] + " ");
        }
    }
}
