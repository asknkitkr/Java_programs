import java.util.Scanner;

class NegativeValuesException extends Exception {
    public NegativeValuesException() {
        super();
    }
}

class ValuesOutOfRangeException extends Exception {
    public ValuesOutOfRangeException() {
        super();
    }
}

public class Result {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        int a = 0, b = 0, c = 0;
    
        for(int i = 0; i < 2; i++) {
            try {
                System.out.print("\nEnter student name: ");
                name = in.next();
    
                System.out.print("Enter marks of three subjects: ");
                if(in.hasNextInt()) {
                    a = in.nextInt();
                    b = in.nextInt();
                    c = in.nextInt();
                }
                else {
                    throw new NumberFormatException();
                }
    
                if(a < 0 || b < 0 || c < 0) {
                    throw new NegativeValuesException();
                }
                if(a > 100 || b > 100 || c > 100) {
                    throw new ValuesOutOfRangeException();
                }
            }
            catch(NumberFormatException e) {
                System.err.println("Error: NumberFormatException");
            }
            catch(NegativeValuesException e) {
                System.err.println("Error: NegativeValuesException");
            }
            catch(ValuesOutOfRangeException e) {
                System.err.println("Error: ValuesOutOfRangeException");
            }
            finally {
                System.out.println("\nStudent name: " + name);
                System.out.println("Marks: " + a + ", " + b + ", " + c);
                System.out.println("Average Marks: " + (a + b + c) / 3);
            }
        }
        in.close();
    }
}
