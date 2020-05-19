package br.com.spring.restful.component;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class TriggerCounter {

  private final HashMap<String, Integer> counter = new HashMap<String, Integer>();

  public void increment(String api) {
    Integer value = counter.get(api);
    if (value != null) {
      value++;
    }
    else {
      value = 1;
    }
    counter.put(api, value);
  }

  public HashMap<String, Integer> getCounter() {
    return counter;
  }

}