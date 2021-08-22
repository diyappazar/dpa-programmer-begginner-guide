public class Rectangle extends Shape{
    public double width ;
    public double height ;
    
    public Rectangle(String color, double height, double width) {
        super(color);
        this.width = width ;
        this.height = height ;
    }
    public Point getCornerLeftLow() {
        Point p = new Point(this.getX(), this.getY() + this.height);
        return p ;
    }
    public Point getCornerLeftUpp() {
        Point p = new Point(this.getX(), this.getY());
        return p ;
    }
    public Point getCornerRightLow() {
        Point p = new Point(this.getX() + this.width, this.getY() + this.height);
        return p ;
    }
    public Point getCornerRightUpp() {
        Point p = new Point(this.getX() + this.width, this.getY());
        return p ;
    }
    public void setLocation(double x, double y) {
        super.setLocation(new Point(x, y));
    }
    public void setColor(String color) {
        super.setColor(color);
    }
    public String getColor() {
        return super.getColor();
    }
    public double getArea() {
        return this.height * this.width ;
    }
    public void print() {
        System.out.println("Width of the Rectangle :  " + this.width + "\nHeight of the Rectangle : " + this.height+"\nColor of the rectangle:   "+this.getColor());
    }
 }