class Point
{
   private double x;
   private double y;
   public double getX(){
       return x;
   }
   public double getY(){
       return y;
   }
   public void setX(double x){
       this.x = x;
   }
   public void setY(double y){
       this.y = y;
   }
   public void print(){
    System.out.println("(" + this.x + ", " + this.y + ")");
}
}
class Shape
{
   private String color;
   private Point location;
   public Shape(String c){
       color = c;
       location = new Point();
   }
   public double getX()
   {
       return location.getX();
   }
   public double getY(){
       return location.getY();
   }
   public String getColour(){
       return color;
   }
   public Point getLocation(){
       return location;
   }
   public void setLocation(double x, double y){
       location.setX(x);
       location.setY(y);
   }
   public void setCol(String c){
       color = c;
   }
   public void print()
   {
       System.out.println("\n Color of the shape: " + color);
       location.print();
   }
}

class Rectangle extends Shape
{
   public double width;
   public double height;
   Rectangle(double w, double h)
   {
       super("Blue");
       try{
           width = w;
           height = h;
       }
       catch(NumberFormatException ne){
           System.out.println("Can not negative.");
       }
   }
   public void setLocation(double w, double h){
       super.setLocation(w, h);
   }
   public void setCol(String c){
       super.setCol(c);
   }
   public double getWidth(){
       return width;
   }
   public double getHeight()
   {
       return height;
   }
  
   public Point getCornerLeftLow(){
       Point l = getLocation();
       l.setX(l.getX() + width);
       l.setY(getY());
       return l;
   }
   public Point getCornerLeftUp(){
       Point l = getLocation();
       return l;
   }
   public Point getCornerRightDown(){
       Point l = getLocation();
       l.setX(l.getX() + width);
       l.setY(getY() + height);
       return l;
   }
   public Point getCornerRightUp(){
       Point l = getLocation();
       l.setY(getY() + height);
       return l;
   }
   public String getColour()
   {
       return super.getColour();
   }
   public double area()
   {
       return width * height;
   } 

   public void print()
   {
       System.out.println("\n Width of Rectangle: " + width + "\t Height of Rectangle: " + height +"\n Area of the Rectangle: " + area());
       System.out.print("\n Left Low: ");
       getCornerLeftLow().print();
       System.out.print("\n Left Up: ");
       getCornerLeftUp().print();
       System.out.print("\n Right Low: ");
       getCornerRightDown().print();
       System.out.print("\n Left Up: ");
       getCornerRightUp().print();
       super.print();
   }
}
class Circle extends Shape
{
   public double radius;
   public Circle(double ra)
   {
       super("Orange");
       try{
           radius = ra;
       }
       catch(NumberFormatException ne)
       {
           System.out.println("not negative");
       }
   }
  
   public void setCenter(double x, double y)
   {
       super.setLocation(x, y);
   }
  
   public void setCol(String c)
   {
       super.setCol(c);
   }
  
   public Point getCenter()
   {
       Point l = getLocation();
       l.setY(l.getY() + radius);
       return l;
   }
  
   public String getColour()
   {
       return super.getColour();
   }
  
   public void print()
   {
       System.out.println("\n Radius of the circle: " + radius +"\n Center Point of Circle: " + getCenter());
       super.print();
   }
}
public class prelab6
{
   public static void main(String ss[])
   {
       Shape shapes[] = new Shape[2];
      
       shapes[0] = new Rectangle(13.5, 12.1);
       shapes[1] = new Circle(11.5);
      
       shapes[0].print();
       shapes[1].print();
   }
}