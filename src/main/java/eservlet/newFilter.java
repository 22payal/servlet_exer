package eservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "newFilter")
public class newFilter implements Filter {



    public void init(FilterConfig config) throws ServletException {

        System.out.println("loginServlet filter initiated");

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("before reaching server");

        chain.doFilter(req, resp);

        System.out.println("after reaching server");
    }

    public void destroy() {
        System.out.println("filter destroyed");
    }


}
