public class Shape {
    private Point location ;
    private String colour ;
    public Shape(String colour) {
        this.colour = colour;
        this.location = new Point(0, 0);
    }
    public double getX() {
        return this.location.getX();
    }
    public double getY() {
        return this.location.getY();
    }
    public void setLocation(Point location) {
        this.location = location;
    }
    public String getColor() {
        return colour;
    }
    public void setColor(String colour) {
        this.colour = colour;
    }
    public void print() {
        System.out.println("Color : " + this.colour + "Point : (" + this.location.getX() + ", " + this.location.getY() + ")");
    }
 }
 