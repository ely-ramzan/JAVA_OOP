// Create a Circle class such that it shall be mandatory for the user to pass the radius when its obbject is instantiated. Encapsulate radius field i.e. expose via getter and setter methods for public access to read and update. Make sure, its value is updated only when new value is greater than 0. Define calculateArea and calculatePerimeter methods with public access modifiers. Demonstrate the implemented functionality from main method of TestCircle class.
public class Circle{
    private int radius;

    public Circle(int radius){
        setRadius(radius);
    }

    public void setRadius(int r){
        if(r > 0)
            this.radius = r;
    }

    public int getRadius(){
        return this.radius;
    }

    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
}