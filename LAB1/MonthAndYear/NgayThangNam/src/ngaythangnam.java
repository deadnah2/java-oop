
import java.util.Scanner;

public class ngaythangnam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        int daysInMonth = 0;

        while (true) {
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter the year: ");
            year = scanner.nextInt();

            
            if (month >= 1 && month <= 12 && year > 0) {
                break;
            } else {
                System.out.println("Invalid month/year. Please try again.");
            }
        }

    
        switch (month) {
            case 2: 
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4: 
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default: 
                daysInMonth = 31;
                break;
        }

        
        System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);

        scanner.close();
    }

    
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}

