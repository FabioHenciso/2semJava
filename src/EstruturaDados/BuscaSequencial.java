public class BuscaSequencial {


    public static void busca (int[] vet, int x1){
        int aux = 0;
        //Busca X1
        long inicio = System.nanoTime();
        for (int i = 0; i < vet.length -1; i++){

            if (vet[i] == x1){
                System.out.println("Numero encontrado na posição " + i);
                aux = 1;
            }
        }
        if (aux == 0){
            System.out.println("-1");
        }
        long fim = System.nanoTime();
        System.out.println("Busca sequencial tempo: "
        + (fim - inicio )/ 1_000_000.0 + "ms\n");
        System.out.println("\n================================\n");
    }

    public static void binaria (int [] vet, int x1){



    }

    public static void main (String [] args){

        int [] vet = new int [100000];


        //vetor

        for(int i = 0; i <100000; i++ ){

            vet[i] = (i + 1) * 2;
        }
        System.out.println("Busca Numero no inicio do vetor: \n");
        busca(vet, 11000);

        System.out.println("Busca numero no meio do vetor:  \n");
        busca(vet, 100000);

        System.out.println("Busca Numero no Final do vetor:  \n");
        busca(vet, 180000);

        System.out.println("Busca numero não existe (inicio): \n");
        busca(vet, 11001);

        System.out.println("Busca numero não existe ( meio)  \n");
        busca(vet, 130001);

        System.out.println("Busca numero não existe ( fim ) \n");
        busca(vet, 180001);
    }


}
