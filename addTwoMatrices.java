import java.util.Scanner;

public class addTwoMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows and columns of the matrix: ");
        n = in.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        System.out.println("Enter the element of the first matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {                
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the element of the second matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {                
                matrix2[i][j] = in.nextInt();
            }
        }

        int[][] matrix3 = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the two matrices is: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
