public class dog {
    String name;
    String breed;
    int age;

    public static void main(String[] args){
        dog a = new dog();
        a.name = "Fido";
        a.age = 7;
        a.breed = "British short hair";
        a.bark();
        a.walk();
        a.info();
    }
    public void bark(){
        System.out.println("waoo waoo...");
    }
    public void walk(){
        System.out.println("Move 5m forward");
    }
    public void info(){
        System.out.println("Name =" + name + "\nAge = " + age + "\nBreed = "+ breed);
    }
}
