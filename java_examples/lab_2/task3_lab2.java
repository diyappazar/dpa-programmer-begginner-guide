/******************************************************************************
                            LAB 2
                            TASK 3
*******************************************************************************/
public class task3_lab2 {
    public static void main(String args[]) {
        int rowCount=8;
        int i;
        int c;
        int initialNum = 1;
        int b;
		rowCount = 5 ;
		for(i=0;i<rowCount;i++)
		{
			for(c=rowCount; c>i; c--)
			{
				System.out.print(" ");
			}
            initialNum = 1;
			for(b=0;b<=i;b++)
			{
                System.out.print(initialNum+ " ");
             initialNum = initialNum * (i - b) / (b + 1);
			}
			System.out.println();
		}
    }
}