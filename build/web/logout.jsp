<%-- 
    Document   : logout
    Created on : Jul 16, 2020, 3:52:06 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("taikhoan");//hủy biến session taikhoan
            response.sendRedirect("index.jsp");
            %>
    </body>
</html>
