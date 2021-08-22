/******************************************************************************
                            LAB 2
                            TASK 1
*******************************************************************************/

import java.util.Scanner;
public class task1_lab2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Enter a point with two cordinates:");
        System.out.println("----------------------------------");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = 0;
        double y2 = 0;
        double distance = Math.pow( x2 - x1,2) + Math.pow(y2-y1,2);
        double radius = 10;
        if(distance <= radius){
            System.out.println("Your points "+x1+","+y1+" are in the circle.");
        }else if(distance>radius){
            System.out.println("Your points "+x1+","+y1+" are not in the circle.");
            System.out.println("----------------------------------");
        }
        System.out.println("----------------------------------");
        input.close();
    }
}