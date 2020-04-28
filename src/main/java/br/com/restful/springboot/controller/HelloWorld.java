package br.com.restful.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

  @GetMapping(value="/")
  public String getMethodName() {
    return "Hi there!";
  }

}