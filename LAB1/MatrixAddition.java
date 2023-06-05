package Java;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Khởi tạo hai ma trận đầu vào
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Nhập giá trị cho ma trận 1
        System.out.println("Nhập giá trị cho ma trận 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Nhập giá trị cho ma trận 2
        System.out.println("Nhập giá trị cho ma trận 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Thực hiện phép cộng hai ma trận
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // In ra ma trận tổng
        System.out.println("Ma trận tổng của hai ma trận là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

