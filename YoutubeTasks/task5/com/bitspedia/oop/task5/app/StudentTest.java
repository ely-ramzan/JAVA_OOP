package com.bitspedia.oop.task5.app;
import com.bitspedia.oop.task5.*;
import com.bitspedia.task5.*;
import java.util.*;

public class StudentTest {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter following entities for Student 1:");
    System.out.println("Name>");
    String name = input.nextLine();
    System.out.println("Email>");
    String email = input.nextLine();
    System.out.println("Cnic>");
    String cnic = input.nextLine();

    Student std1 = new Student(name, email, cnic);

    Student std2 = new Student("Shaheer Anjum", "shaheer001@gmail.com","35404-8765356-7");

    //setting address for std1:
    PhoneNumber phoneNumberStd1 = new PhoneNumber("+92", "300", "8805430");

    Address addressStd1 = new Address("Govt High School","Nawankot", "Sheikhupura", "Pakistan", phoneNumberStd1);
    std1.setAddress(addressStd1);
    std2.setAddress(addressStd1);
    
    Course course1 = new Course("PHY121","PHYSICS FOR ENGINNERS");
    std1.setCourse1(course1);
    std2.setCourse1(course1);

    Course course2 = new Course("HUM101","ISLAMIC STUDIES");
    std1.setCourse2(course2);
    std2.setCourse2(course2);

    System.out.println("\nStudent1 Details:");
    System.out.println("Name = " + std1.getName() + "\nEmail = " + std1.getEmail() + "\nCnic = " + std1.getCnic() +

     "\nCourse1 Information >\nCourse Code = " + std1.getCourse1().getCourseCode() + "\nCourse Title = " + std1.getCourse1().getCourseTitle() + 

    "\nCourse2 Information >\nCourse Code = " + std1.getCourse2().getCourseCode() + "\nCourse Title = " + std1.getCourse2().getCourseTitle()  + 

    "\nAddress Information >\nStreet Address = " + std1.getAddress().getStreetAddress() + "\nTown = " + std1.getAddress().getTown() + "\nCity = " +  std1.getAddress().getCity() + "\nCountry = " + std1.getAddress().getCountry() + 

    "\nPhone Number Information >\nCountry Code = " + std1.getAddress().getPhoneNumber().getCountryCode() + "\nCity Code = " + std1.getAddress().getPhoneNumber().getCityCode() + "\nLine Number = " + std1.getAddress().getPhoneNumber().getLineNumber());

    System.out.println("\nStudent2 Details:");
    System.out.println("Name = " + std2.getName() + "\nEmail = " + std2.getEmail() + "\nCnic = " + std2.getCnic() +

     "\nCourse1 Information >\nCourse Code = " + std2.getCourse1().getCourseCode() + "\nCourse Title = " + std2.getCourse1().getCourseTitle() + 

    "\nCourse2 Information >\nCourse Code = " + std2.getCourse2().getCourseCode() + "\nCourse Title = " + std2.getCourse2().getCourseTitle()  + 

    "\nAddress Information >\nStreet Address = " + std2.getAddress().getStreetAddress() + "\nTown = " + std2.getAddress().getTown() + "\nCity = " +  std2.getAddress().getCity() + "\nCountry = " + std2.getAddress().getCountry() + 

    "\nPhone Number Information >\nCountry Code = " + std2.getAddress().getPhoneNumber().getCountryCode() + "\nCity Code = " + std2.getAddress().getPhoneNumber().getCityCode() + "\nLine Number = " + std2.getAddress().getPhoneNumber().getLineNumber());
    
    input.close();
    }
}
