package br.com.spring.restful.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import br.com.spring.restful.component.TriggerCounter;

@Component
public class CounterInterceptor implements HandlerInterceptor {

  @Autowired
  TriggerCounter triggerCounter;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    triggerCounter.increment(request.getMethod() + ":" + request.getRequestURI());
    return HandlerInterceptor.super.preHandle(request, response, handler);
  }

}