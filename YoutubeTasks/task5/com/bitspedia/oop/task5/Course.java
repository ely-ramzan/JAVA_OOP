package com.bitspedia.oop.task5;

public class Course {
    private String courseCode;
    private String courseTitle; 

    public Course(String courseCode,String courseTitle){
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
    }

    public Course(){}

    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseTitle() {
        return courseTitle;
    }
    
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
