import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.print("Enter the side of the matrix : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n]; int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\nEnter the element for Matrix A for " + (i+1) + (j+1) + " Element = ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\nEnter the element for Matrix B for " + (i+1) + (j+1) + " Element = ");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }

        }


        System.out.println("\nThe resultant Array is :-");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\t" + c[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}