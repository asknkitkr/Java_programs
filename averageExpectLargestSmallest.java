import java.util.Scanner;

public class averageExpectLargestSmallest {
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

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (sum - max - min) / (n-2);
        System.out.println("Average: " + avg);

        in.close();
    }
}
