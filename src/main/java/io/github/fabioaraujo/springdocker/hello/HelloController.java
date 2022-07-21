package io.github.fabioaraujo.springdocker.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }

}