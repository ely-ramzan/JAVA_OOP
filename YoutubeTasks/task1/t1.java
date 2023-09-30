
// Initialize a variable n with some +ve integer value. Then create implement logic to print first n prime numbers on console. 
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to Initialize a variable n with some +ve integer value:");
        int number = input.nextInt();
        System.out.println("Prime numbers upto n are:");
        printPrimeNumbers(number);
        input.close();

    }

    public static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isEven(int n){
        if(n % 2 == 0)
            return true;
        return false;        
    }

    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        if (number <= 1 || isEven(number))
            return false;

        int i = 3;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0)
                return false;
            i++;
        }
        return true;

    }
}