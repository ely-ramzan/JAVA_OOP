// car class car1 is object 
class Car{
    String name;
    int model;
    float avg;

    public void features(){
        System.out.println("name = " + this.name);
        System.out.println("model number = " + this.model);
        System.out.println("average = " +  this.avg);
    }
    Car()
    {
        //Car() is non-parameterized constructor
    }
    Car(Car car2)
    {
        //Car(car1) is copy constructor
        this.name = car2.name ;
        this.model = car2.model;
        this.avg = car2.avg;
    }
    
    Car(String name,int model,float avg)
    {
        //Car(x,y,z) is non-parameterized constructor
        this.name = name;
        this.model = model;
        this.avg = avg;
    }

}


public class Oops {
    public static void main(String[] args)
    {
        Car car1 = new Car();  //Car() is non-parameterized constructor
        car1.name = "Mehran";
        car1.model = 1998;
        car1.avg = 12;
        System.out.println("Features of car1:");
        car1.features();

        Car car2 = new Car(car1); //Car(car1) is copy constructor
        System.out.println("Features of car2:");
        car2.features();

        Car car3 = new Car("Corolla",2009,19);
        //Car(x,y,z) is non-parameterized constructor
        System.out.println("Features of car3:");
        car3.features();
    }


}
