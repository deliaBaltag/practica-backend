package com.delia;

import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Created by Delia on 7/24/2015.
 */


public class CorsFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        HttpServletRequest request= (HttpServletRequest) req;
        if(request.getMethod().equalsIgnoreCase("OPTIONS")){
            return;
        }
        chain.doFilter(req, res);
    }



    public void destroy() {}

}
