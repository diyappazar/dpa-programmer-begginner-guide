import java.util.Scanner;
public class task1_lab3 {
    public static void main(String[] args) 
    { 
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println(getProduct(number)); 
    }
    static int getProduct(int number) 
    { 
        int product = 1; 
        int total = 0 ;
        int newnum;
        while (number != 0) { 
            newnum = product * (number % 10); 
            number = number / 10; 
            total = newnum +number;
        } 
        
        return total; 
    } 
}

