package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init 호출");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter doFilter 호출");
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Servlet 요청 수행 완료!");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy 호출");
    }

}
