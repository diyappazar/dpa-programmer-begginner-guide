import java.util.Scanner;
public class task4_lab4 {

    public static void main(String[] args) {
        int numCity;
        double[][] location;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the cities: ");
        numCity = in.nextInt();
        location = new double [numCity][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < location.length; i++)
        {
            for (int x = 0; x < location.length; x++)
            {
                location[i][x] = in.nextDouble();
            }
        }
        exactLocation(location);
    }

    public static void exactLocation(double[][] array)
    {
        double totalDistance = 0;
        int position = 0;
        double cityDistance;
        for(int i =0; i < array.length; i++)
        {
            cityDistance = 0;
            for (int j = 0; j < array.length; j++)
            {
                cityDistance = Math.sqrt( Math.pow( (array[j][0] - array[i][0]), 2) + Math.pow( (array[j][1] - array[i][1]), 2) );
            }
            if ((i==0 || totalDistance > cityDistance))
            {
                totalDistance = cityDistance;
                position = i;
            }
        }
        System.out.print("The central city is at (" + array[position][0] + ", " + array[position][1] + ")");
        System.out.println("The total distance to the other cities are :" + totalDistance );
    }

}