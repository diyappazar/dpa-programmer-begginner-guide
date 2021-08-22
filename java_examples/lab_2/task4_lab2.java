/******************************************************************************
                            LAB 2
                            TASK 4
*******************************************************************************/
import java.util.Scanner;
public class task4_lab2 {
    public static void main(String argc[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer with 2 or more digits: ");
        int numUser = scanner.nextInt();
        int num1 = 0;
        int num2 = numUser % 10;
        while(numUser >= 10){
            numUser = numUser / 10;
            num1 = numUser % 10;
        }
        int result = num1+num2;
        System.out.print("Results is: "+result);
    }

}
