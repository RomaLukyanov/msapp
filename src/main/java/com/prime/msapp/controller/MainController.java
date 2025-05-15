package com.prime.msapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        // Возвращает имя файла без расширения, который находится в папке static или
        // templates
        return "index";
    }
}
