package com.example.learn.config;

import com.example.learn.util.JWTUtil;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class JWTFilter extends GenericFilterBean {

    private final String HEADER_NAME = "Authorization";
    private String secret;
    private List<String> excludedURLs;

    public JWTFilter(String secret, List<String> excludedURLs) {
        this.secret = secret;
        this.excludedURLs = excludedURLs;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        if (!excludedURLs.contains(servletRequest.getServletPath())) {
            String token = resolveToken((HttpServletRequest) request);
            if (token == null) {
                throw new ServletException("Missing or invalid Authorization header");
            }
            if (JWTUtil.verify(token, secret)) {
                servletRequest.setAttribute("user_id", JWTUtil.getUserId(token));
            } else {
                throw new ServletException("Invalid token");
            }
        }

        chain.doFilter(request, response);
    }

    private String resolveToken(HttpServletRequest request) {
        String token = request.getHeader(HEADER_NAME);
        if (token == null || !token.startsWith("Bearer "))
            return null;
        else
            return token.substring(7);
    }

}