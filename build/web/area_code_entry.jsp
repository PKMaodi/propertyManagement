<%-- 
    Document   : area_code_entry
    Created on : 23 Feb 2023, 6:19:38 PM
    Author     : MaodiPK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Code Entry Page</title>
    </head>
    <body>
        <h1>Area code</h1>
        <p>
            Please enter area code below:
        </p>
        <form action="AreaCodeDataServlet.do" method="POST">
            <table>
                <tr>
                    <td>Area code:</td>
                    <td><input type="text" name="areaCode"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>

