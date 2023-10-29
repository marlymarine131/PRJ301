<%-- 
    Document   : ListAll
    Created on : Oct 16, 2023, 8:21:44 AM
    Author     : oteee
--%>
<%@page import="java.util.List"%>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<%@page contentType="text/html" import="model.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<section>

    <%
        CourstList list = new CourstList();
        List<YourID> course = list.listAllCourse();
    %>
    <table>
        <TR><TH>Course ID</TH><TH>Student Name</TH><TH>LectureName</TH><TH>Credit</TH></TR>
                <% for (YourID s : course) {%>
        <tr>
            <td><%= s.getCourse()%></td>
            <td><%= s.getLectureName()%></td>
            <td><%= s.getSubjectName()%></td>
            <td><%= s.getCredits()%></td>
        </tr>
        <% }%>
    </table>
</section>

<%@ include file="/includes/footer.jsp" %>