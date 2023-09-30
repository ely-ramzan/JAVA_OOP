// Make a class EmployeeTest, in main method, instantiate three different Employee type objects that make use of different constructors.
public class TestEmployee {
    public static void main(String[] args) {
        String cnic = "35404-8345353-9";
        String name = "Ali Ramzan";
        double salary = 12934322.333;

        Employee id1 = new Employee();
        System.out.printf("CNIC: %s\nName: %s\nSalary: %.2f\n", id1.getCnic(), id1.getName(), id1.getSalary());
        Employee id2 = new Employee(cnic, name);
        System.out.printf("CNIC: %s\nName: %s\nSalary: %.2f\n", id2.getCnic(), id2.getName(), id2.getSalary());
        Employee id3 = new Employee(cnic, name, salary);
        System.out.printf("CNIC: %s\nName: %s\nSalary: %.2f\n", id3.getCnic(), id3.getName(), id3.getSalary());

    }
}
