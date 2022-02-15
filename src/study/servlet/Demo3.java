package study.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo3 extends HttpServlet {
    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取浏览器路径
        String requestURI = req.getRequestURI();
        String path = requestURI.substring(requestURI.lastIndexOf("/"));
        System.out.println(path);
        if(path.equals("/vip")){
            System.out.println("100元");
        }else if(path.equals("/vvip")){
            System.out.println("200元");
        }else System.out.println("300元");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
