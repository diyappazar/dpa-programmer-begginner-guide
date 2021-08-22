public class debug {

    public static void main(String[] args) {
        Rectangle getVar = new Rectangle("Blue", 3, 4);
        System.out.print("Left down corner :    ");
        getVar.getCornerLeftLow().print();
        System.out.print("Left up corner :      ");
        getVar.getCornerLeftUpp().print();
        System.out.print("Right down corner :   ");
        getVar.getCornerRightLow().print();
        System.out.print("Right up corner :     ");
        getVar.getCornerRightUpp().print();
        getVar.print();
        System.out.println("Area of the shape : " + getVar.getArea());
    }
 }