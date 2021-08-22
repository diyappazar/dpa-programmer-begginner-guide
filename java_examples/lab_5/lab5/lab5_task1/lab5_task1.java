public class lab5_task1 {
	public static void main(String[] args) {
		chosePoint point1 = new chosePoint();
		chosePoint point2 = new chosePoint(10, 30.5);
		System.out.println("The distance between (" + point1.getX() + ", " + point1.getY() + ") and ("+ point2.getX() + ", " + point2.getY() + ") is: " + point1.distance(point2));
	}
}