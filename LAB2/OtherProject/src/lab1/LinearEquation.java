package lab1;
import java.util.Scanner;
public class LinearEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();

        if(a == 0){
            System.out.println("Error: a should not be zero");
        }else {
            double x = -b / a;
            System.out.println("The solution is x = "+ x);
        }

	}

}
