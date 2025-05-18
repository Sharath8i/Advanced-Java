<%@ page import="java.sql.*" %>
<html>
<head><title>Update Employee</title></head>
<body>
<h2>Update Employee Details</h2>

<form action="update.jsp" method="post">
    Enter Emp No to Update: <input type="text" name="empno"><br>
    New Name: <input type="text" name="empname"><br>
    New Basic Salary: <input type="text" name="salary"><br>
    <input type="submit" value="Update">
</form>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");

if(empno != null && empname != null && salary != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        String query = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, empname.trim());
        ps.setInt(2, Integer.parseInt(salary.trim()));
        ps.setInt(3, Integer.parseInt(empno.trim()));

        int rows = ps.executeUpdate();

        if (rows > 0) {
            out.println("<p>Record updated successfully!</p>");
        } else {
            out.println("<p>No employee found with Emp No: " + empno + "</p>");
        }

        conn.close();
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    }
}
%>

<a href="report.jsp">View Report</a> |
<a href="insert.jsp">Back to Insert</a>

</body>
</html>
