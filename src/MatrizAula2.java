import java.util.Scanner;

public class MatrizAula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] mat = new float[3][4];
        float acm = 0f;
        for (int i = 0; i< mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                mat[i][j]= (float) Math.random() * 10;
                System.out.printf("%.2f   ", mat[i][j]);
                acm += mat[i][j];
            }
            System.out.println("");
        }
        int notas = mat.length * mat[0].length;
        float media = acm/notas;
        System.out.println("Media: " + media);


        System.out.println("\nMedia por aluno\n");
        for (int i = 0; i< mat.length; i++){
            acm = 0;
            for (int j = 0; j<mat[i].length; j++) {

               acm += mat[i][j];
            }
            System.out.println("A media é " + acm/mat[i].length);
        }

        System.out.println("\nMedia por prova\n");
        media = 0;
        for (int j = 0; j< mat[0].length; j++){
            acm = 0;
            for (int i = 0; i<mat.length; i++) {

                acm += mat[i][j];
            }
            media = acm/ mat.length;
            System.out.println("A media da prova " + (j+1) + " é " + media);

        }
    }
}