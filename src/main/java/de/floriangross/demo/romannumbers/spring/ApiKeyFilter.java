package de.floriangross.demo.romannumbers.spring;

import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ApiKeyFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final var header = request.getHeader("X-API-KEY");

        if ("secure".equals(header)) {
            filterChain.doFilter(request, response);
        }else {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
        }
    }
}
