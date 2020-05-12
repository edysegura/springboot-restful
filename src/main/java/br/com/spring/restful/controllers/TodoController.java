package br.com.spring.restful.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

  @GetMapping(value="/")
  public String index() {
    return "Hi there!";
  }

}