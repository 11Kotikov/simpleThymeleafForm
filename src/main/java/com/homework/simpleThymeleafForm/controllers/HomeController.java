package com.homework.simpleThymeleafForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 Базового веб-приложения Spring MVC
Начните с создания простого веб-приложения с использованием Spring MVC. Это может быть простой сайт,
который выводит "Привет, мир!" на главной странице. Используйте аннотацию @Controller и @RequestMapping
 для маршрутизации запросов на эту страницу.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}

