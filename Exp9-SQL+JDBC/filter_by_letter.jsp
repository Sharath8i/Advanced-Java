<%-- Develop a JDBC project using MySQL to append  the fields empno,  empname and 
basicsalary into the table Emp of the database Employee by getting the fields  through keyboard 
and Generate the report as follows.--%>


<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Filter Employees by Starting Letter</title>
</head>
<body>
<h2>Filter Employees by Name Starting Letter</h2>

<form method="get">
    Enter starting letter: <input type="text" name="letter" maxlength="1">
    <input type="submit" value="Search">
</form>

<%
    String letter = request.getParameter("letter");

    if (letter != null && !letter.trim().equals("")) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
            ps.setString(1, letter + "%");

            ResultSet rs = ps.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
%>
                <hr>
                Emp_No: <%= rs.getInt("Emp_NO") %><br>
                Emp_Name: <%= rs.getString("Emp_Name") %><br>
                Basic Salary: <%= rs.getInt("Basicsalary") %><br>
<%
            }

            if (!found) {
                out.println("<p>No employees found starting with letter '" + letter + "'</p>");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        }
    }
%>
</body>
</html>





<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Salary Report</title>
    <style>
        body {
            font-family: 'Courier New', monospace;
            font-size: 20px;
        }
        .line {
            font-weight: bold;
            color: black;
        }
        .center {
            text-align: center;
            font-weight: bold;
            font-size: 24px;
        }
    </style>
</head>
<body>

<div class="line">~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</div>
<div class="center">Salary Report</div>
<div class="line">~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</div>

<form method="get">
    <p><b>Enter starting letter of Employee Name:</b>
    <input type="text" name="letter" maxlength="1">
    <input type="submit" value="Search"></p>
</form>

<%
    String letter = request.getParameter("letter");

    if (letter != null && !letter.trim().equals("")) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
            ps.setString(1, letter + "%");

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
%>
<div class="line">~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</div>
<b>Emp_No&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</b> <%= rs.getInt("Emp_No") %><br>
<b>Emp_Name :</b> <%= rs.getString("Emp_Name") %><br>
<b>Basic&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</b> <%= rs.getInt("Basicsalary") %><br>
<%
            }

            if (!found) {
                out.println("<p>No employees found starting with letter '" + letter + "'</p>");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        }
    }
%>

</body>
</html>
