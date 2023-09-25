package org.example;

import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        session.invalidate();

        out.print("You're successful log out");
        out.close();
    }
}
