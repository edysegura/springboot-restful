package br.com.spring.restful.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.spring.restful.interceptor.CounterInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  @Autowired
  private CounterInterceptor counterInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(counterInterceptor);
    // TODO add token interceptor
    // TODO exception handler
  }

}
