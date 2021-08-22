import java.util.Scanner;
public class task2 {
    public static void main (String[] args) {    
        System.out.println("Welcome to my second lab task in Java!");
        System.out.println("--------------------------------------");
        System.out.println("Enter three points for triangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x3 and y3");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s = ((x1 + y1) + (x2 + y2) + (x3 + y3)) / 2;
        double area = Math.sqrt(s * (s - (x1 - y1)) * (s - (x2 - y2)) * (s - (x3 - y3)));
        System.out.println("Area of the triangle:"+area);
    }
}