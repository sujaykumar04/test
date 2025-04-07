<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login status</title>
</head>
<body>
<%
						String  admin = request.getParameter("admin");

						String password = request.getParameter("password");
						
						if("admin".equals(admin) &&  "password".equals(password))
						
						{
								out.println("<h2> Admin Verified </h2>");
											
							}
						else{
							out.println("<h2> Invalid Credentials </h2>");
						}
%>

</body>
</html>