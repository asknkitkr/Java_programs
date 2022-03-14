import java.util.Scanner;

public class largestSmallestDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Difference: " + (max - min));

        in.close();
    }
}
