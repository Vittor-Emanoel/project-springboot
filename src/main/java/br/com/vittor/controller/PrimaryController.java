package br.com.vittor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController()
@RequestMapping("/primary")
public class PrimaryController {
  @GetMapping("")
  public String test () {
    return "Olá";
  }
  
}
