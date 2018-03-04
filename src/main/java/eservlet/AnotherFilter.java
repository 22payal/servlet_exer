package eservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "AnotherFilter")
public class AnotherFilter implements Filter {


    public void init(FilterConfig config) throws ServletException {

        System.out.println("another filter initiated");

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter before reaching server");

        chain.doFilter(req, resp);

        System.out.println("filter after reaching server");
    }

    public void destroy() {
        System.out.println("another filter destroyed");
    }


}
