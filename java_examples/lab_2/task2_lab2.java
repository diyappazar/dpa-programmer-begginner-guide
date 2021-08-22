/******************************************************************************
                            LAB 2
                            TASK 2
*******************************************************************************/
public class task2_lab2 {
    public static void main(String[] args){ 
        int n = 24;
        int u0 = 2;
        int u1 = 2;
        int month = 1;

        for (int i=1;i<=n;++i)
        {
            System.out.print("Month number "+month+" and the number of rubbits are:"+ u1 +"\n");
            month = month + 1;
            int sum = u0 + u1;
            u0 = u1;
            u1 = sum;
        }
    }
}  
