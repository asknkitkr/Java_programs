import java.util.Scanner;
import java.util.Arrays;

public class MaximumNumberOfTimes {
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
        Arrays.sort(arr);

        int max = 1, res = arr[0];
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                if(count > max) {
                    max = count;
                    res = arr[i-1];
                }
                count = 1;
            }
        }

        if(count > max) {
            max = count;
            res = arr[n-1];
        }

        System.out.println("Maximum number of times: " + res);

        in.close();
    }
}
