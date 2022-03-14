public class MathOperation {
    public static void main(String[] args) {
        int n = args.length;
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            if(args[i].charAt(args[i].length()-1) == ',')
                args[i] = args[i].replace(",", "");
        }

        int sum = 0;
        double avg = 0;

        try {
            for(int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(args[i]);
                sum += a[i];
            }
            avg = sum / n;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        }
        catch(NumberFormatException e) {
            System.err.print("Error: NumberFormatException");
        }
        catch(ArithmeticException e) {
            System.err.print("Error: ArithmeticException");
        }
    }    
}
