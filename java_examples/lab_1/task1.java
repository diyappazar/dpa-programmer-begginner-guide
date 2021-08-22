import java.util.Scanner;
public class task1 {
        public static void main (String[] args) {
            System.out.println("Welcome to my first lab task in Java!");
            System.out.println("--------------------------------------");
            System.out.println("To find the distance I will need you to enter two points :)");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter x1 and y1");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            System.out.println("Enter x2 and y2");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double totalDistance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
            System.out.println("Distance within the point are:"+totalDistance);
        }
    }