package org.example;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContextType("text/html; chrset=UTF-8");
        PrintWriter out = response.getWriter;

        String str = request.getParameter("Username");
        out.print("Welcome " + str);

        HttpSession session = request.getSession();
        session.setAttribute("Uname", str);

        // retrieve data from ServletContext object
        ServletContext scx = getServletContext();
        int allUsers = (Integer)context.getAttribute("All Users");
        int allActiveUsers = (Integer)context.getAttribute("Active Users");
        out.print("<br>All Users = " + allUsers);
        out.print("<br>Active Users = " + allActiveUsers);

        out.print("<br><a href='logout'>Logout</a>");

        out.close();
    }
}
