package EstruturaDados;

public class selecaoDireta {
    public static void main (String[] args) {
        int[] vetor1 = {25, 57, 48, 37, 12, 92, 86, 33};
        int menor = vetor1[0];


        for (int i = 0; i < vetor1.length -1 ; i++) {
            menor = i;

            for ( int j = i+1; j < vetor1.length; j++){

                if (vetor1[j] < vetor1[menor]){

                    menor = j;
                }
            }
            int temp = vetor1[i];
            vetor1[i] = vetor1[menor];
            vetor1[menor] = temp;

        }



    }



}
