// Declare and initialize byte, short, int, float, long, double, boolean type variables using literals, change those values by user input and then print all of 7 variables on console. (in lab video, you have already seen, how to get input from user using Scanner class)
import java.util.Scanner;
public class t2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of a byte:" );
        byte a = 33;
        a = input.nextByte();
        System.out.println("Enter value of b short:" );
        short b = 233;
        b = input.nextShort();
        System.out.println("Enter value of c int:" );
        int c = 3333;
        c = input.nextInt();
        System.out.println("Enter value of d float:" );
        float d = 99.9f;
        d = input.nextFloat();
        System.out.println("Enter value of e long:" );
        long e = 3333333L;
        e = input.nextLong();
        System.out.println("Enter value of f double:" );
        double f = 333.333;
        f = input.nextDouble();
        System.out.println("Enter value of flag bool:" );
        boolean flag = true;
        flag = input.nextBoolean();

        System.out.printf("Value of \n byte = %d\n short = %d\n int = %d\n float = %f\n long = %d\n double = %f\n boolean = %b\n",a,b,c,d,e,f,flag);
        input.close();

    }    
}
