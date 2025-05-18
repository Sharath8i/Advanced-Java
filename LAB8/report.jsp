<%@ page import="java.sql.*" %>
<html>
<head><title>Salary Report</title></head>
<body>
<h2>Salary Report</h2>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
int grandTotal = 0;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    while(rs.next()) {
        int id = rs.getInt("Emp_NO");
        String name = rs.getString("Emp_Name");
        int salary = rs.getInt("Basicsalary");
        grandTotal += salary;
%>
<pre>
Emp_No     : <%= id %>
Emp_Name   : <%= name %>
Basic      : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
    }
    rs.close();
    conn.close();
} catch(Exception e) {
    out.println("Error: " + e.getMessage());
}
%>
<pre>
Grand Salary   : <%= grandTotal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<a href="insert.jsp">Go Back</a>
</body>
</html>
