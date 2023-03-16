<%-- 
    Document   : month_code_info
    Created on : 24 Feb 2023, 12:04:28 PM
    Author     : MaodiPK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Month Code Info Page</title>
    </head>
    <body>
        <h1>Month code info</h1>
        <%
            String monthCodeInfo = (String)request.getAttribute("monthCodeInfo");
        %>
        <p>
            Please see outcome below:<br>
            <b><%=monthCodeInfo%></b>
        </p>
        <p>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>


