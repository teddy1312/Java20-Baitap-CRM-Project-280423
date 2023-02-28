package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ErrorPage",urlPatterns = {"/error404","/error403"})
public class ErrorPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        if("/error404".equals(servletPath)){
            req.getRequestDispatcher("404.jsp").forward(req,resp);
        } else {
            req.getRequestDispatcher("403.jsp").forward(req,resp);
        }
    }
}
