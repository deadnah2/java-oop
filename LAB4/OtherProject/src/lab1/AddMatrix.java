package lab1;
import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix rows: ");
        int m = sc.nextInt();
        System.out.print("Enter matrix columns: ");
        int n = sc.nextInt();
        double[][] A = new double[m][n];
        double[][] B = new double[m][n];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
            	System.out.print("A[" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter matrix B:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
            	System.out.print("B[" + (i+1) + "][" + (j+1) + "]: ");
                B[i][j] = sc.nextDouble();
            }
        }
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Matrix C: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}