/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oteee
 */
public class CourstList {

    protected Connection connection;
    private static String serverName = "LAPTOP-URP60GBI\\SQLEXPRESS";
    private static String dbName = "PRJ301_YourID";
    private static String portNumber = "1433";
    private static String instance = "";
    private static String userId = "sa";
    private static String passWord = "1234";
    private static String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;

    public CourstList() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, userId, passWord);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }

    public YourID addCourse(String courseID, String subjectName, String lectureName, int credit) {
        try ( Connection connection = DriverManager.getConnection(url, userId, passWord)) {
            String query = "INSERT INTO YourID (CourseID, Subject, LectureName, Credit) VALUES (?,?,?,?)";
            try ( PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, courseID);
                preparedStatement.setString(2, subjectName);
                preparedStatement.setString(3, lectureName);
                preparedStatement.setString(4, credit + "");
                preparedStatement.executeUpdate();
                return new YourID(courseID, subjectName, lectureName, credit);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    public List<YourID> listAllCourse() throws SQLException{
        List<YourID> courses = new ArrayList<>();
        String query = "select * from YourID";
        try ( PreparedStatement preparedStatement = connection.prepareStatement(query);  ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {               
                YourID course = new YourID();
                course.setCourse(resultSet.getString("CourseID"));
                course.setSubjectName(resultSet.getString("Subject"));
                course.setLectureName(resultSet.getString("LectureName"));
                course.setCredits(Integer.parseInt(resultSet.getString("Credit")));
                courses.add(course);
            }
        }

        return courses;
    }
}
