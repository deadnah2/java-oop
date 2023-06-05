package lab1;
import javax.swing.JOptionPane;
public class CaculateSDPQ
{
    public static void main(String[] args)
    {
        String num1, num2;
        double Sum, Difference, Product, Quotient; 
        
        num1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double s1 = Double.parseDouble(num1);
        num2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double s2 = Double.parseDouble(num2);
        Sum = s1 + s2;
        JOptionPane.showMessageDialog(null,"Sum = " + Sum, "Sum of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        Difference = Math.abs( s1 - s2 );
        JOptionPane.showMessageDialog(null,"Difference = " + Difference, "Difference of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        Product = s1 * s2;
        JOptionPane.showMessageDialog(null,"Product = " + Product, "Product of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        if(s2 == 0) JOptionPane.showMessageDialog(null, "Invalid divesor!", "Quotient of 2 numbers", 1);
        else{
        Quotient = s1 / s2;
        JOptionPane.showMessageDialog(null,"Quotient = " + Quotient, "Quotient of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
