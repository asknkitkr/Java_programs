import java.util.Scanner;

public class ArraySu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements: ");
        n = in.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array is : " + sum);
        System.out.println("Average of array is : " + (double)sum/n);

        in.close();
    }
}
