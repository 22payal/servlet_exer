package eservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String u=request.getParameter("username");
        String p=request.getParameter("password");

        if ((u.equals("admin"))&&(p.equals("admin")))
        {
          response.sendRedirect("welcome.jsp");
        }

        else
        {
            response.sendRedirect("invalid.jsp");
        }



    }
}
