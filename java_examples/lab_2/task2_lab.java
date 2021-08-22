public class task2_lab {
    public static void main(String[] args) {
        int combNum = 0;
        int i;
        for (i = 1; i < 8; i++) {
            for (int k = i + 1; k < 8; k++) {
                System.out.println(i + " " + k);
                combNum++;
            }
        }
        System.out.println("Combination Total: " + combNum);
    }
}
    
    

