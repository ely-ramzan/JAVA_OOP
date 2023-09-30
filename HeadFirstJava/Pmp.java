class Student{
    String name;
    int marks;
    double percentage;

    public void printInfo(String name){
        System.out.println("func1:   " + name);
    }
    public void printInfo(int makrs){
        System.out.println("func2:   " + marks);
    }
    public void printInfo(double percentage){
        System.out.println("func3:   " + percentage);
    }
    public void printInfo(String name,int makrs,double percentage){
        System.out.println("func<all>:   " + name + ": marks = " + marks + " : percentage = " + percentage);
    }
    public void printInfo(String name,int makrs){
        System.out.println("func4:   " + name + ": " + marks);
    }
    public void printInfo(String name,double percentage){
        System.out.println("func5:   " + name + ": " + percentage);
    }
    public void printInfo(int makrs,double percentage){
        System.out.println("func6:   " + "total = " +  ((marks * 100) / percentage));
    }
    // public double printInfo(int makrs,float percentage){
    //     return ((marks * 100) / percentage);
    // }
}
public class Pmp {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "ali";
        s1.marks = 97;
        s1.percentage = 99.9999;

        s1.printInfo(s1.marks,s1.percentage);
    }
}
 