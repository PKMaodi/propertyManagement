package za.ac.tut.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.PropertyManager;

/**
 *
 * @author MemaniV
 */
public class AreaCodeDataServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String areaCode = request.getParameter("areaCode");
        
        PropertyManager pm = new PropertyManager();
        
        String areaCodeInfo = pm.getLowestIncomeInfo(areaCode);
        request.setAttribute("areaCodeInfo", areaCodeInfo);
        
        RequestDispatcher disp = request.getRequestDispatcher("area_code_info.jsp");
        disp.forward(request, response);        
    }
}


