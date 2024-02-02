package com.homework.simpleThymeleafForm.controllers;

import com.homework.simpleThymeleafForm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
Создание формы ввода и обработка данных формы
Создайте страницу с формой ввода, используя Thymeleaf для рендеринга формы. Затем создайте контроллер Spring MVC,
который обрабатывает отправку формы и выводит полученные данные.
Это может быть форма для регистрации или любая другая форма, которая собирает информацию от пользователя.
Все необходимые примеры кода для этого задания мы разбирали на семинаре.
 */

/*
Этот класс используется для маршрутизации запросов на страницу для заполнения формы.
 */
@Controller
public class FormController {

    @GetMapping("/form") //адрес localhost:8080/form для отображения формы для ввода данных о пользователе.
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String processForm(User user, Model model) {
        //здесь добавил логику обработки данных формы
        model.addAttribute("user", user);
        return "form-result"; // отображение результата обработки формы на странице.
    }
}
