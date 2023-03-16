<%-- 
    Document   : month_entry
    Created on : 23 Feb 2023, 6:27:15 PM
    Author     : MaodiPK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Month Entry Page</title>
    </head>
    <body>
        <h1>Month entry</h1>
        <p>
            Please enter month code below:
        </p>
        <form action="MonthCodeDataServlet.do" method="POST">
            <table>
                <tr>
                    <td>Month code:</td>
                    <td><input type="text" name="monthCode"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>


