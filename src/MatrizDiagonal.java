import java.util.Scanner;

public class MatrizDiagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] mat = new float[4][4];
        for (int i = 0; i< mat.length; i++){

            for (int j = 0; j<mat[0].length; j++){

                mat[i][j] = (float) Math.random() * 10;
                System.out.printf("%.2f   ", mat[i][j]);

                }
            System.out.println("");
            }

        double soma = 0;
        System.out.println("\n\nDiagonal principal\n\n");
        for (int i = 0; i< mat.length; i++){

            for (int j = 0; j<mat[0].length; j++){

               if (i==j){
                   System.out.println("   "+ mat[i][j] +"   ");
                   soma += mat[i][j];
               }

            }
        }

        System.out.printf("\nA soma da diagonal primaria é %.2f ", soma);


        soma = 0;
        System.out.println("\n\n Diagonal secundaria\n\n");
        for (int i = 0; i< mat.length; i++){

            for (int j = 0; j<mat[0].length; j++) {

                if (i + j == mat.length - 1){
                    System.out.println("   "+ mat[i][j] +"   ");
                    soma += mat[i][j];
                }

            }
        }

        System.out.printf("\nA soma da diagonal secundaria é %.2f ", soma);

        }
    }

