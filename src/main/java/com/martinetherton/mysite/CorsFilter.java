

package com.martinetherton.mysite;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by martin on 04/10/15.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,X-Prototype-Version,Content-Type,Cache-Control,Pragma,Origin,authorization, x-auth-token, x-xsrf-token");
   //     response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        response.setHeader("Access-Control-Max-Age", "3600");
   //     response.setHeader("Access-Control-Allow-Headers", "authorization, x-auth-token, x-requested-with,x-xsrf-token");



//        res.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");res.setHeader("Access-Control-Allow-Credentials", "true");
//        res.setHeader("Access-Control-Allow-Methods", "OPTIONS, POST, GET");res.setHeader("Access-Control-Expose-Headers","Access-Control-Allow-Origin");
//        res.setHeader("Access-Control-Allow-Headers", "X-Requested-With,X-Prototype-Version,Content-Type,Cache-Control,Pragma,Origin");

//        if (request.getMethod() != "OPTIONS") {
        if( ! "OPTIONS".equals(request.getMethod())) {
            chain.doFilter(req, res);
        } else {
        }
    }

    @Override
    public void destroy() {

    }
}
