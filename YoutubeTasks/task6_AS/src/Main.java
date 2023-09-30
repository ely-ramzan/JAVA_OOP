import java.util.*;

//t1:
//Define two enum, first for Gender and another for Month. Gender shall be enumeration of two values
// i.e. Male and Female. Month enum shall be defined with January, February, ... up to December as
// values. Month enum shall also store the number of days of each month.
//
//        Define a User that shall be composed of id, name, gender and birthMonth attributes.
//        Use above created enums for gender and birthMonth fields. Create a User object and initialize
//        it from user input, gender shall be initialized in constructor and birthMonth shall be
//        initialzed using set methed. After the object is initialized, print all fields' values of user
//        object. Also print the number of days of birthMonth.
//        ___________
//t2:
//Define EnumTest class, in main method:
//        Iterate the Month enum (created in 6a.1) to print all months' names, ordinal value, and number
//        of days of each month. Also iterate the Month enum to print a subset of months e.g. from Sep.
//        to Dec.
//        Create sub list of Month enum that shal store Jan, Mar, May, Jul only. EnumSet.of(..) method,
//        see the API docs for usage detail.
public class Main {
    public static void main(String[] args) {
//        t1
        User user1 = new User("Ali", 1, Month.SEPTEMBER, Gender.MALE);
        user1.setBirthmonth(Month.DECEMBER);
        System.out.println(user1);
        System.out.println(user1.getBirthmonth().getNo_of_days());

//        t2
        int counter = 1;
        for (Month month : Month.values()) {
            System.out.println(month);
            System.out.println(counter++);
            System.out.println(month.getNo_of_days());
        }
        for (Month month : EnumSet.range(Month.SEPTEMBER, Month.DECEMBER)) {
            System.out.println(month);
        }

        Month[] sublist = EnumSet.of(Month.JANUARY, Month.MARCH, Month.MAY).toArray(new Month[3]);
        for (Month month:sublist)
            System.out.println(month);
    }
}