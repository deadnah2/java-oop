package Java;
import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coefficients for the linear equation ax + b = 0");
        
        System.out.print("Enter coefficient 'a': ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient 'b': ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Invalid input. 'a' should not be zero.");
        } else {
            double x = -b / a;
            System.out.println("Root x: " + x);
        }
        
        scanner.close();
    }
}

