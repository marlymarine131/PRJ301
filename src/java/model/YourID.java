/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author oteee
 */
public class YourID {
    private String courseID;
    private String subjectName;
    private String lectureName;
    private int Credits;

    public YourID(String course, String subjectName, String lectureName, int Credits) {
        this.courseID = course;
        this.subjectName = subjectName;
        this.lectureName = lectureName;
        this.Credits = Credits;
    }

    public YourID() {
        
    }

    public String getCourse() {
        return courseID;
    }

    public void setCourse(String course) {
        this.courseID = course;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }

    @Override
    public String toString() {
        return "YourID{" + "course=" + courseID + ", subjectName=" + subjectName + ", lectureName=" + lectureName + ", Credits=" + Credits + '}';
    }
    
}
