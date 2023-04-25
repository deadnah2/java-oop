
import java.util.Arrays;

public class ArraySortingSum {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 7, 3, 1, 8, 6, 9, 2, 4 }; 

        System.out.println("Mảng số nguyên trước khi sắp xếp: " + Arrays.toString(arr));

        
        Arrays.sort(arr);

        System.out.println("Mảng số nguyên sau khi sắp xếp: " + Arrays.toString(arr));

        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        
        double average = (double) sum / arr.length;

        System.out.println("Tổng các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + average);
    }
}

