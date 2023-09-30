import java.util.Scanner;
public class t5 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter table number:");
    int table = input.nextInt();

    System.out.println("Enter table starting number:");
    int start = input.nextInt();

    System.out.println("Enter table ending number:");
    int end = input.nextInt();

    while(start <= end)
    {
        System.out.printf("%d x %d = %d\n",table,start,(table * start));
        start ++;
    }
    
    input.close();
    }
}
