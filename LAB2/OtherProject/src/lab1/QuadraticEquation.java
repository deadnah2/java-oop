package lab1;
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a ");
        double a = sc.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        double denta = b * b - 4 * a * c;

        if(a == 0){
            System.out.println("Error: a should not be zero");
        }else if (denta < 0){
            System.out.println("The equation has no real solution");
        }else if(denta == 0){
            double x = (-b) / (2 * a);
            System.out.println("The equation has a double solution x = "+ x);
        }else {
            double x1 = (-b + Math.sqrt(denta)) / ( 2 * a);
            double x2 = (-b - Math.sqrt(denta)) / ( 2 * a);
            System.out.println("The equation has two solutions x1 =" + x1 + " and x2 = " + x2);
        }
	}

}
