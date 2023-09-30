import java.util.Scanner;

public class get {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = get.nextInt();
        System.out.println(num);

        System.out.println("Enter a floating number: ");
        double num2 = get.nextDouble();
        System.out.println(num2);

        get.nextLine();

        System.out.println("Enter ur name: ");
        String name = get.nextLine();
        System.out.println(name);
        get.close();
    }
}
