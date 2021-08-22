public class lab_5_task1_cont{
    static class Rectangle{
        double width = 1;
        double height = 1;
        public void changeValue(double w, double h){
            width = w;
            height = h;
        }
        public double getArea(){
            return width * height;
        }
        public double getPerimeter(){
            return 2 * (height + width);
    
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to task 5!");
        Rectangle rect1 = new Rectangle();
        rect1.changeValue(4 , 40);
        System.out.println("First Rectangle's area is: "+ rect1.getArea()+ ":)");
        System.out.println("First Rectangle's perimeter is: "+ rect1.getPerimeter()+ ":)");
        Rectangle rect2 = new Rectangle();
        rect2.changeValue(3.5, 35.9);
        System.out.println("Second Rectangle's area is: "+ rect2.getArea()+ ":)");
        System.out.println("Second Rectangle's perimeter is: "+ rect2.getPerimeter()+ ":)");
    }
  
}
