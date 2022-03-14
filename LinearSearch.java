import java.util.Scanner;

public class LinearSearch {
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

        int k;
        System.out.print("Enter element to search: ");
        k = in.nextInt();

        int flag = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == k) {
                flag = i;
            }
        }

        if(flag < 0) {
            System.out.println(-1);
        } else {
            System.out.println(flag);
        }
        in.close();
    }
}
