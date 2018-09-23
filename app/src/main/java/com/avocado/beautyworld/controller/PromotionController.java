package com.avocado.beautyworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PromotionController {

  @GetMapping("/test")
  public String index() {
    return "index";
  }


}
