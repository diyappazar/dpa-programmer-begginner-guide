public class task1_lab{
    public static void main(String[] args) {
        double i = 1.0;
        double total = 0;
        while(i<=97){
            total += i/(i+2);
            i += 2;
        }
        tv.setText(new DecimalFormat("##.##").format(total));

        System.out.println("Result of the series:" +total);
    }
}