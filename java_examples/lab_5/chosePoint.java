public class chosePoint {
	private double x;
	private double y;
	chosePoint() {
		this(0, 0);
	}
	chosePoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
   public double distance(chosePoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + 
   			 Math.pow(myPoint.getY() - y, 2));
   }
 	public double distance(double x, double y) {
 		return distance(new chosePoint(x, y));
 	}
}