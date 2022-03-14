import java.util.Scanner;
import java.util.ArrayList;

public class findDuplicateString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of strings: ");
        n = in.nextInt();
        
        ArrayList<String> arr = new ArrayList<String>();
        System.out.print("Enter the strings: ");
        for(int i = 0; i < n; i++) {
            arr.add(in.next());
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr.get(i).equals(arr.get(j))) {
                    System.out.println(arr.get(j));
                }
            }
        }
        
        in.close();
    }
}
