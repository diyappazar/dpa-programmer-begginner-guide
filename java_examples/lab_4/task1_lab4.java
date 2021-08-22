import java.util.Scanner;

public class task1_lab4 {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Type ten typed: ");
    int[] typed = new int[10];

    for (int i = 0; i < typed.length; i++) {
        typed[i] = input.nextInt();
    }

    int[] primaryKey = removeCopies(typed);
    System.out.print("Distincts : ");

    for (int i = 0; i < primaryKey.length; i++) {
        System.out.print(primaryKey[i] + " ");
    }
}

public static int[] removeCopies(int[] list) {
    if (list.length == 0 || list.length == 1) {
        return list;
    }
    int[] tempArray = new int[list.length];

    int totalCount = 0;
    for (int i = 0; i < list.length; i++) {
        int processedNumb = list[i];

        boolean isDuplicated = false;
        for (int j = 0; j < totalCount; j++) {
            if (processedNumb == tempArray[j]) {
                isDuplicated = true;
                break;
            }
        }

        if (!isDuplicated) {
            tempArray[totalCount++] = processedNumb;
        }
    }

    int[] result = new int[totalCount];
    for (int i = 0; i < totalCount; i++) {
        result[i] = tempArray[i];
    }

    return result;
    }
}