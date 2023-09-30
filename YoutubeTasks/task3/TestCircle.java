public class TestCircle {
    public static void main(String[] args){
    Circle c1 = new Circle(10);
    System.out.println("Raduis = " + c1.getRadius());
    c1.setRadius(0);
    System.out.println("Raduis = " + c1.getRadius());
    c1.setRadius(15);
    System.out.println("Raduis = " + c1.getRadius());
    
    System.out.println("Area = " + c1.calculateArea());
    System.out.println("Perimeter = " + c1.calculatePerimeter());

    }
}
