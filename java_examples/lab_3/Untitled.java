import java.io.*; 
public class Untitled {
    /* Function to get product of digits */
    static int getProduct(int n) 
    { 
        int product = 1; 
  
        while (n != 0) { 
            product = product * (n % 10); 
            n = n / 10; 
        } 
  
        return product; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int n = 4513; 
  
        System.out.println(getProduct(n)); 
    } 
}

