// Get a 4 digit integer number from user input and print each digits on a separate line.

import java.util.Scanner;
public class t3 {
    public static void main(String[] args)
    {
        int number = get4DigitNo();
        System.out.println("Your number = " + number);
        printNumber(number);
    }
    
    public static int get4DigitNo()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with 4 digits:");
        int n = input.nextInt();

        while(n < 1000 || n > 9999){
            System.out.println("!!!!Enter a valid number with 4 digits only:");
            n = input.nextInt();
        }
        input.close();
        return n;
    }

    public static void printNumber(int num)
    {
        int[] arr = new int[4];
        int i = 3;
        while(num != 0){
            arr[i] =  num % 10;
            num = num / 10;   
            i --;
        }
        i = 0;
        while (i < 4){
            System.out.println(arr[i]);
            i ++;
        }
        
    }
    // public static void printNumber(int num) {
    //     String numberString = String.valueOf(num);
    //     int[] digits = Arrays.stream(numberString.split("")).mapToInt(Integer::parseInt).toArray();

    //     for (int digit : digits) {
    //         System.out.println(digit);
    //     }
    // }
}