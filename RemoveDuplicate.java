import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicate {
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
        int j = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        for(int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
