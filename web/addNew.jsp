<%-- 
    Document   : addNew
    Created on : Oct 16, 2023, 8:20:58 AM
    Author     : oteee
--%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<jsp:useBean id ="counter" class="model.Counter" scope="application"/>

<!DOCTYPE html>
<section>
    <h1>Course Enrollment</h1>

    <form action="AddNew" method="post">
        <h2>Course</h2>
        <label for="courseID">CourseID:</label>
        <input type="text" name="courseID" required><br>
        <label for="subjectName">subjectName:</label>
        <input type="text" name="subjectName" required><br>
        <label for="lectureName">lectureName:</label>
        <input type="text" name="lectureName" required><br>
        <label for="Credits">Credits</label>
        <input type="text" name="Credits" required><br>
        </table>
        <HR><input type="submit" value="Add"/>
    </form>
</section>

<%@ include file="/includes/footer.jsp" %>
