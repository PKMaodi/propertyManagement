<%-- 
    Document   : area_code_info
    Created on : 24 Feb 2023, 11:49:14 AM
    Author     : MaodiPK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Code Info Page</title>
    </head>
    <body>
        <h1>Area code info</h1>
        <%
            String areaCodeInfo = (String)request.getAttribute("areaCodeInfo");
        %>
        <p>
            Please see outcome below:<br>
            <b><%=areaCodeInfo%></b>
        </p>
        <p>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>











