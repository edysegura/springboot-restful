package br.com.spring.restful.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.restful.component.TriggerCounter;

@RestController
public class MainController {

  @Autowired
  TriggerCounter counter;

  @GetMapping(value = "/")
  public String index() {
    return "Welcome to Todo List REST API!";
  }

  @GetMapping(value = "/counters")
  public Map<String, Integer> getCounters() {
    return counter.getCounter();
  }

}