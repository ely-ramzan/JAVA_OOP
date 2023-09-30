// Get an integer from user that represent a year, it must be greater than 500, if less, ask again until valid number is entered (hint: use loop to remain asking until valid number is given, when valid number is given break the loop). Your program should print, is the year leap or not. (A leap year is one which is evenly divided by 4. But for century years, the year must also be evenly divided by 400. e.g. 1800 is divisible at 4, but not leap because its a century year and is not evenly divisible at 400. So you must also check whether the user entered year is century year or not to decide correctly)
import java.util.Scanner;
public class t4 {
    public static void main(String[] args){
        int year = getYear();
        if(isLeapYear(year))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    public static int getYear(){
        int year;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter year greater than 500: ");
            year = input.nextInt();
        }while(year <= 500);
        input.close();
        return year;
    }
    public static boolean isLeapYear(int year){
        if(year % 100 == 0){
            if(year % 4 == 0 && year % 400 == 0)
                return true;
            else 
                return false;
        }
        else{
            if(year % 4 == 0)
                return true;
            else 
                return false;
        }
    }
}
