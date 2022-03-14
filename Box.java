import java.util.Scanner;

public class Box {
    static double w, h, d;
    Box(double width, double height, double depth) {
        w = width;
        h = height;
        d = depth;
    }

    double volume() {
        return w*h*d;
    }
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);

        double w, h, d;
        System.out.print("Enter width, height and depth: ");
        w = in.nextDouble();
        h = in.nextDouble();
        d = in.nextDouble();

        Box b = new Box(w,h,d);
        System.out.print("Volume: " + b.volume());

        in.close();
    }
}
