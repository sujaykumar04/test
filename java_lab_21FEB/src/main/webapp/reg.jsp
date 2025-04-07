<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

        Statement stmt = connect.createStatement();
        String alterSQL = "ALTER TABLE users ADD COLUMN password VARCHAR(255), ADD COLUMN address VARCHAR(255)";
        try {
            stmt.executeUpdate(alterSQL);
        } catch (Exception e) {
            
        }

        String insertSQL = "INSERT INTO users (name, password, address) VALUES ('JohnDoe', 'securePass123', '123 Main Street, NY')";
        int rowsInserted = stmt.executeUpdate(insertSQL);

        if (rowsInserted > 0) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }

        stmt.close();
        connect.close();
    } catch (Exception e) {
        out.println(e);
    }
%>