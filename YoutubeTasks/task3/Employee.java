// Make a class Employee with attributes cnic, name and salary. Make all fields private and expose them via proper getter and setter methods. Choose appropriate data type for each property yourself. In Employee class, make following constructors:
// Constructor that takes no parameter. It shall print, "No-argument constructor called."
// Constructor that takes CNIC and name only. It shall intialize both fields using setter methods.
// Fully parameterized constructor, that means, that takes all parameters and initialize associated instance attributes. From this constructor, call the 2nd construction to intialize CNIC and name instance attributes.

public class Employee {
    private String cnic;
    private String name;
    private double salary;

    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getCnic(){
        return this.cnic;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    } 
    public Employee(){
        System.out.println("No-argument constructor called.");
    }
    public Employee(String cnic,String name){
        setCnic(cnic);
        setName(name);
    }
    public Employee(String cnic,String name,double salary){
        this(cnic,name);
        setSalary(salary);
    }
}
