package br.com.spring.restful.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.spring.restful.interceptor.CounterInterceptor;
import br.com.spring.restful.interceptor.TokenInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  private TokenInterceptor tokenInterceptor;
  private CounterInterceptor counterInterceptor;

  @Autowired
  public InterceptorConfig(
    TokenInterceptor tokenInterceptor,
    CounterInterceptor counterInterceptor
  ) {
    this.tokenInterceptor = tokenInterceptor;
    this.counterInterceptor = counterInterceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // registry.addInterceptor(tokenInterceptor);
    registry.addInterceptor(counterInterceptor);
  }

}
