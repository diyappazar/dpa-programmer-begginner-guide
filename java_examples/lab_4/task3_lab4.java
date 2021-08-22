import java.util.Scanner;

public class task3_lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        double[][] userArray = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = in.nextDouble();
            }
        }

        int[] point = locateLargest(userArray);
        System.out.printf("The point of the biggest element is (%d, %d)%n",
            point[0], point[1]);
    }

    public static int[] locateLargest(double[][] list) {
        int[] point = new int[]{0, 0};
        double biggest = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (biggest < list[i][j]) {
                    biggest = list[i][j];
                    point[0] = i;
                    point[1] = j;
                }
            }
        }
        return point;
    }


}