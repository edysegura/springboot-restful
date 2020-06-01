package br.com.spring.restful.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import br.com.spring.restful.component.RequestHitsCounter;

@Component
public class CounterInterceptor implements HandlerInterceptor {

  @Autowired
  RequestHitsCounter triggerCounter;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    System.out.println("||----------> API Counter");

    String api = request.getMethod() + ":" + request.getRequestURI();
    triggerCounter.increment(api);

    return HandlerInterceptor.super.preHandle(request, response, handler);
  }

}
