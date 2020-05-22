package br.com.spring.restful.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class TokenInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    System.out.println("||----------> Token authorization validation");
    System.out.println("||----------> Path: " + request.getRequestURI());

    if (!request.getRequestURI().contains("swagger") && StringUtils.isEmpty(request.getHeader("Authorization"))) {
      throw new Exception("Could not check the authorization");
    }

    return HandlerInterceptor.super.preHandle(request, response, handler);
  }

}
