import java.util.Scanner;

public class lab_5_task2_cont {
   static class MyInteger{
        private int value;
        public MyInteger(int specialvalue){ 
            value = specialvalue;
        }
        public double getValue(){
            return value;
        }
        public boolean isEven(){
            return (value %= 2)== 0 ;
        }
        public boolean isOdd(){
            return (value %= 2) == 1 ;
        }
        public boolean isPrime(){
            if(value == 1 || value == 2){
                return true;
            }
            else{
            for(int i = 2;i < value;i++){
                if(i % value == 0)
                return false;
                }
            }
            return true;
        }
        public double getValue(int value1){
            return value1;
        }
        public static boolean isEven(int value1){
            return (value1 %= 2)== 0 ;
        }
        public static  boolean isOdd(int value1){
            return (value1 %= 2) == 1 ;
        }
        public static  boolean isPrime(int value1){
            if(value1 == 1 || value1 == 2){
                return true;
            }
            else{
            for(int i = 2;i < value1;i++){
                if(i % value1 == 0)
                return false;
                }
            }
            return true;
        }
        public static boolean isEven(MyInteger value1){
            return value1.isEven();
        }
        public static boolean isOdd(MyInteger value1){
            return value1.isOdd();
        }
        public static boolean isPrime(MyInteger value1){
            return value1.isPrime();
        }
        public  boolean equals(int value1){
            if(value1 == value) {return true;}
            return false;
        }
        public boolean equals(MyInteger value5) {
            if (value5.value == this.value) //this here stands for instance within the object
            {return true;}
            return false;
        }

        public static int parseInt(char[] array){
            int result=0;
            for(int i=0;i<array.length;i++){
                result=result*10+(array[i]-'0');
            }
            return result;
        }
        public static int parseInt(String value4){
            return Integer.parseInt(value4);
        }
    }   
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int userChoose = newScan.nextInt();
        MyInteger num1 =new MyInteger(userChoose);
        System.out.println("The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd,or prime, respectively.");
        System.out.println("Number 1 is Odd: "+num1.isOdd());
        System.out.println("Number 1 is Even: "+num1.isEven());
        System.out.println("Number 1 is Prime: "+num1.isPrime());


        System.out.println("\nThe static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.");
        System.out.println("Enter the second number: ");
        int userChoose2 = newScan.nextInt();
        MyInteger num2 =new MyInteger(userChoose2);
        System.out.println("Number 2 is Odd: "+num2.isOdd());
        System.out.println("Number 2 is Even: "+num2.isEven());
        System.out.println("Number 2 is Prime: "+num2.isPrime());

        System.out.println("\nThe static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return trueif the specified value is even, odd, or prime, respectively");
        System.out.println("For the specicified value (4) results are: ");
        System.out.println("Number 3 is Odd: "+MyInteger.isOdd(4));
        System.out.println("Number 3 is Even: "+MyInteger.isEven(4));
        System.out.println("Number 3 is Prime: "+MyInteger.isPrime(4));

        System.out.println("\nThe methods equals(int) and equals(MyInteger) that return true if the value in this object is equal tothe specified value.");
        System.out.println("\nEnter two values to compare their equality.");
        int userChoose3 = newScan.nextInt();
        int userChoose4 = newScan.nextInt();
        MyInteger num5 =new MyInteger(userChoose3);
        MyInteger num4 =new MyInteger(userChoose4);
        System.out.println(num5.getValue() +" is equal to "+num4.getValue()+" is "+num4.equals(num5));
        System.out.println("\nA static method parseInt(char[]) that converts an array of numeric characters to an int value.");
        System.out.println("Integers that converted:");
        int result = MyInteger.parseInt(new char[] {'1', '2', '3'});
        System.out.println(result);
        int result1 = MyInteger.parseInt("1234");
        System.out.println(result1);
    }

}
