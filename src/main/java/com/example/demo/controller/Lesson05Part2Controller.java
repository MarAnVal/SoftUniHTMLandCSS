package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson05Part2Controller {
    @GetMapping("/05.2.1")
    public ModelAndView lesson05part2task1(){
        return new ModelAndView("lesson05part2/05.2.1");
    }
    @GetMapping("/05.2.2")
    public ModelAndView lesson05part2task2(){
        return new ModelAndView("lesson05part2/05.2.2");
    }
    @GetMapping("/05.2.3")
    public ModelAndView lesson05part2task3(){
        return new ModelAndView("lesson05part2/05.2.3");
    }
    @GetMapping("/05.2.4")
    public ModelAndView lesson05part2task4(){
        return new ModelAndView("lesson05part2/05.2.4");
    }
    @GetMapping("/05.2.5")
    public ModelAndView lesson05part2task5(){
        return new ModelAndView("lesson05part2/05.2.5");
    }
    @GetMapping("/05.2.6")
    public ModelAndView lesson05part2task6(){
        return new ModelAndView("lesson05part2/05.2.6");
    }
    @GetMapping("/05.2.7")
    public ModelAndView lesson05part2task7(){
        return new ModelAndView("lesson05part2/05.2.7");
    }
    @GetMapping("/05.2.8")
    public ModelAndView lesson05part2task8(){
        return new ModelAndView("lesson05part2/05.2.8");
    }
    @GetMapping("/05.2.9")
    public ModelAndView lesson05part2task9(){
        return new ModelAndView("lesson05part2/05.2.9");
    }
    @GetMapping("/05.2.10")
    public ModelAndView lesson05part2task10(){
        return new ModelAndView("lesson05part2/05.2.10");
    }
}
