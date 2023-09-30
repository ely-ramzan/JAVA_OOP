// Often oldage people forget their year of birth but remember an approximate age. Define a Person class having two constructors where first takes name and age and second takes name and date of birth (of LocalDate type). The issue is, if you stored age in an integer type variable, it would get outdated after a year, so being a good programmer, you should convert the age into date of birth to store it (i.e. first constructor case). So, declare only two instance attribute i.e. String name and LocalDate dateOfBirth and initialize dateOfBirth no matter which constructor was used to instantiate the object. Make some logic to convert age to LocalDate. Also define a public int getAge() method that shall calculate age from dateOfBrith instance variable and return it.
import java.time.*;

public class Person {

    String name;
    int age;
    LocalDate dateOfBirth;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.dateOfBirth = LocalDate.now().minusYears(age);
    }

    public Person(String name,LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now().getYear());

    }
    
}
