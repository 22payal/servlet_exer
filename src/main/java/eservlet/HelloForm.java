package eservlet;

import java.io.*;
import java.lang.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
            int fn =Integer.parseInt(request.getParameter("blog_id"));
            String ln = request.getParameter("content");
//
//            out.println(fn);
//            out.println(ln);

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise", "root", "payal");
            PreparedStatement pst = con.prepareStatement("insert into user1 values(?,?)");
            pst.setInt(1,fn);
            pst.setString(2,ln);

            int i = pst.executeUpdate();

            if(i!=0){
                out.println("<br>Record has been inserted successfully");
            }
            else{
                out.println("failed to insert the data");
            }
        }
        catch (Exception e){
            out.println(e);
        }
    }
}



