package Java.LAB1;
import java.util.Scanner;

public class hephuongtrinh {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Giai he phuong trinh bac nhat 2 an x1, x2:");
    System.out.println("a11.x1 + a12.x2 = b1");
    System.out.println("a21.x1 + a22.x2 = b2");

    System.out.println("Nhap gia tri a11: ");
    double a11 = scanner.nextDouble();
    System.out.println("Nhap gia tri a12: ");
    double a12 = scanner.nextDouble();
    System.out.println("Nhap gia tri a21: ");
    double a21 = scanner.nextDouble();
    System.out.println("Nhap gia tri a22: ");
    double a22 = scanner.nextDouble();
    System.out.println("Nhap gia tri b1: ");
    double b1 = scanner.nextDouble();
    System.out.println("Nhap gia tri b2: ");
    double b2 = scanner.nextDouble();

    double determinant = a11*a22 - a21*a12;

    if(determinant == 0){
        if((a11/a12 == a21/a22) && (a11 / a12 == b1/b2)){
            System.out.println("Infinite solution!");
        } else {
            System.out.println("No solution satisfied!");
        }
    } else {
        double x1 = (( b1 * a22 - b2 * a12) / determinant);
        double x2 = (( b2 * a11 - b1 * a21) / determinant);

        System.out.println("Solution: ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    scanner.close();
    }
}
