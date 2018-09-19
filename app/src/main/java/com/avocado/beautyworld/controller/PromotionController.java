package com.avocado.beautyworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {

  @GetMapping("/")
  public String index() {
    return "index";
  }


}
