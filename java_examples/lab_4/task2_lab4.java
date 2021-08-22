import java.util.Scanner;

public class task2_lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter firstList size with elements: ");
        int size1 = input.nextInt();
        int[] firstList = new int[size1];
        for (int i = 0; i < size1; i++) {
            firstList[i] = input.nextInt();
        }
        System.out.print("Enter secondList size with elements: ");
        int size2 = input.nextInt();
        int[] secondList = new int[size2];
        for (int i = 0; i < size2; i++) {
            secondList[i] = input.nextInt();
        }

        System.out.print("firstList:  ");
        for (int i = 0; i < firstList.length; i++) {
            System.out.print(firstList[i] + " ");
        }
        System.out.print("\nsecondList:");
        for (int i = 0; i < secondList.length; i++) {
            System.out.print(secondList[i] + " ");
        }

        int[] mergedList = merge(firstList, secondList);
        System.out.print("\nThe merged list is is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }


    }

    public static int[] merge(int[] firstList, int[] secondList) {
        int mergedSize = firstList.length + secondList.length;
        int[] mergedList = new int[mergedSize];

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index1 < firstList.length && index2 < secondList.length) {
            if (firstList[index1] <= secondList[index2]) {
                mergedList[index3] = firstList[index1];
                index1++;
            } else {
                mergedList[index3] = secondList[index2];
                index2++;
            }
            index3++;
        }
        while (index1 < firstList.length) {
            mergedList[index3] = firstList[index1];
            index1++;
            index3++;
        }
        while (index2 < secondList.length) {
            mergedList[index3] = secondList[index2];
            index2++;
            index3++;
        }

        return mergedList;
    }
}