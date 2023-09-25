package org.example;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountUserListener implements HttpSessionListener {
    ServletContext context = null;
    static int all = 0;
    static int active = 0;

    // notification about the created session
    public void sessionCreated(HttpSessionEvent e) {
        all++;
        active++;

        context = e.getSession().getServletContext();
        context.setAttribute("All Users", all);
        context.setAttribute("Active Users", active);
    }

    // invalid session
    public void sessionDestroy(HttpSessionEvent e) {
        active--;
        context.setAttribbute("Active Users", active);
    }
}
