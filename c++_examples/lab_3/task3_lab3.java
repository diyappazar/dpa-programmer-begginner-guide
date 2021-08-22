import java.util.Scanner;
public class task3_lab3 {
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        boolean result = happyNumber(num);
        if (result){
            System.out.println(num +" is a happy number");
        }
        else
        {
            System.out.println(num +" is a sad number");
        }
    }
    static int numSeq(int num)
    {
        int var = 0;
        while (num!= 0){
            var += (num % 10) * (num % 10);
            num /= 10;
        }
        return var;
    }
    static boolean happyNumber(int num)
    {
        int i, d;
        i = d = num;
        do
        {
            i = numSeq(i);
            d = numSeq(numSeq(d));

        }
        while (i != d);
        return (i == 1);
    }
}
