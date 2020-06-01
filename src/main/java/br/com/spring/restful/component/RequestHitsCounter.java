package br.com.spring.restful.component;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class RequestHitsCounter {

  private final HashMap<String, Integer> counters = new HashMap<String, Integer>();

  public void increment(String api) {
    Integer value = counters.get(api);
    value = (value != null) ? value + 1 : 1;
    counters.put(api, value);
  }

  @SuppressWarnings("unchecked")
  public HashMap<String, Integer> getCounter() {
    return (HashMap<String, Integer>) counters.clone();
  }

}