package study.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextDemo extends HttpServlet {
    //ServletConfig config;

    /*public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletContext context = config.getServletContext();
        ServletContext context = req.getServletContext();
        String globaldesc = context.getInitParameter("globaldesc");
        System.out.println("desc：" + globaldesc);

        context.setAttribute("age",23);
        System.out.println(context.getAttribute("age"));
        context.removeAttribute("age");
        System.out.println(context.getAttribute("age"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
