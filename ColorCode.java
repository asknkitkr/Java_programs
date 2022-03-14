import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        java.util.Scanner in = new Scanner(System.in);
        
        System.out.print("Enter color code: ");
        char c = in.next().charAt(0);

        switch(c) {
            case 'R':
                System.out.print("Red");
                break;
            case 'B':
                System.out.print("Blue");
                break;
            case 'G':
                System.out.print("Green");
                break;
            case 'O':
                System.out.print("Orange");
                break;
            case 'Y':
                System.out.print("Yellow");
                break;
            case 'W':
                System.out.print("White");
                break;
            default:
                System.out.print("Invalid Code");
                break;
        }
        in.close();
    }
}