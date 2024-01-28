package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson05Part3Controller {
    @GetMapping("/05.3.1")
    public ModelAndView lesson05part3task1(){
        return new ModelAndView("lesson05part3/05.3.1");
    }
    @GetMapping("/05.3.2")
    public ModelAndView lesson05part3task2(){
        return new ModelAndView("lesson05part3/05.3.2");
    }
    @GetMapping("/05.3.3")
    public ModelAndView lesson05part3task3(){
        return new ModelAndView("lesson05part3/05.3.3");
    }
    @GetMapping("/05.3.4")
    public ModelAndView lesson05part3task4(){
        return new ModelAndView("lesson05part3/05.3.4");
    }
    @GetMapping("/05.3.5")
    public ModelAndView lesson05part3task5(){
        return new ModelAndView("lesson05part3/05.3.5");
    }
    @GetMapping("/05.3.6")
    public ModelAndView lesson05part3task6(){
        return new ModelAndView("lesson05part3/05.3.6");
    }
    @GetMapping("/05.3.7")
    public ModelAndView lesson05part3task7(){
        return new ModelAndView("lesson05part3/05.3.7");
    }
    @GetMapping("/05.3.8")
    public ModelAndView lesson05part3task8(){
        return new ModelAndView("lesson05part3/05.3.8");
    }
    @GetMapping("/05.3.9")
    public ModelAndView lesson05part3task9(){
        return new ModelAndView("lesson05part3/05.3.9");
    }
    @GetMapping("/05.3.10")
    public ModelAndView lesson05part3task10(){
        return new ModelAndView("lesson05part3/05.3.10");
    }
}

