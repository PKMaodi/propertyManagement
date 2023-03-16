package za.ac.tut.controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.PropertyManager;

/**
 *
 * @author MemaniV
 */
public class MonthCodeDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String monthCode = request.getParameter("monthCode");
        
        PropertyManager pm = new PropertyManager();
        
        String monthCodeInfo = pm.getHighestIncomeInfo(monthCode);
        request.setAttribute("monthCodeInfo", monthCodeInfo);
        
        javax.servlet.RequestDispatcher disp = request.getRequestDispatcher("month_code_info.jsp");
        disp.forward(request, response);   
    }

}



