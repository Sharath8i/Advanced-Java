<%--  9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the empid through keyboard and Generate the report as
follows --%>>


<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Employee by Emp_NO</title></head>
<body>
<h2>Delete Employee by Employee Number</h2>

<form method="get">
    Enter Emp_NO to delete: <input type="text" name="empno">
    <input type="submit" value="Delete">
</form>

<%
    String empnoStr = request.getParameter("empno");

    if (empnoStr != null && !empnoStr.isEmpty()) {
        try {
            int empno = Integer.parseInt(empnoStr);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
            PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_NO = ?");
            ps.setInt(1, empno);
            int deleted = ps.executeUpdate();

            if (deleted > 0) {
                out.println("<p>✅ Deleted employee with Emp_NO " + empno + ".</p>");
            } else {
                out.println("<p>⚠️ No employee found with Emp_NO " + empno + ".</p>");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        }
    }
%>

<h2>📄 Updated Salary Report</h2>
<%
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while(rs.next()) {
%>
            <hr>
            Emp_No: <%= rs.getInt("Emp_NO") %><br>
            Emp_Name: <%= rs.getString("Emp_Name") %><br>
            Basic Salary: <%= rs.getInt("Basicsalary") %><br>
<%
        }

        rs.close();
        stmt.close();
        con.close();
    } catch(Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
