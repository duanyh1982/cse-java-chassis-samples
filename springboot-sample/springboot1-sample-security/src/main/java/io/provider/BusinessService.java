package io.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessService {
  @GetMapping(path = "test")
  public String hello(@RequestParam(name = "name") String name) {
    return String.format("hello %s", name);
  }

  @GetMapping(path = "adminGet")
  public String adminGet() {
    return "adminGet";
  }

  @PostMapping(path = "adminPost")
  public String adminPost() {
    return "adminPost";
  }
}
