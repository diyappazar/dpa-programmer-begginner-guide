import java.util.Scanner;

public class lab4_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] integers = new int[10]; 
        System.out.print("Please, enter ten integers: ");
        for (int i = 0; i < integers.length; i++) integers[i] = in.nextInt();
        System.out.print("Minimum number is " + integers[smallLocation(integers)] + " at the location of " + smallLocation(integers));
    }
    public static int smallLocation(int[] dizi) {
        if (dizi.length <= 1)
        return 0;
        int min = dizi[0];
        int location = 0;
            for (int i = 1; i < dizi.length; i++) {
                if (dizi[i] < min) {
                    min = dizi[i];
                    location = i;
                }
            }
        return location;
    }
}