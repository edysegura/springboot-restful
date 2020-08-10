package br.com.spring.restful.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.restful.component.RequestHitsCounter;

@RestController
public class MainApi {

  @Autowired
  RequestHitsCounter counter;

  @GetMapping()
  public String index() {
    return "Welcome to Todo List REST API!<br /><a href=\"http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config\">Swagger UI</a>";
  }

  @GetMapping(value = "/counters")
  public Map<String, Integer> getCounters() {
    return counter.getCounter();
  }

}