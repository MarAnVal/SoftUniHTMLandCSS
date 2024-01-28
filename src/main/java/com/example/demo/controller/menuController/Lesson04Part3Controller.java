package com.example.demo.controller.menuController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson04Part3Controller {
    @GetMapping("/04.3.1")
    public ModelAndView lesson04part3task1(){
        return new ModelAndView("lesson04part3/04.3.1");
    }
    @GetMapping("/04.3.2")
    public ModelAndView lesson04part3task2(){
        return new ModelAndView("lesson04part3/04.3.2");
    }
    @GetMapping("/04.3.3")
    public ModelAndView lesson04part3task3(){
        return new ModelAndView("lesson04part3/04.3.3");
    }
    @GetMapping("/04.3.4")
    public ModelAndView lesson04part3task4(){
        return new ModelAndView("lesson04part3/04.3.4");
    }
    @GetMapping("/04.3.5")
    public ModelAndView lesson04part3task5(){
        return new ModelAndView("lesson04part3/04.3.5");
    }
    @GetMapping("/04.3.6")
    public ModelAndView lesson04part3task6(){
        return new ModelAndView("lesson04part3/04.3.6");
    }
    @GetMapping("/04.3.7")
    public ModelAndView lesson04part3task7(){
        return new ModelAndView("lesson04part3/04.3.7");
    }
    @GetMapping("/04.3.8")
    public ModelAndView lesson04part3task8(){
        return new ModelAndView("lesson04part3/04.3.8");
    }
    @GetMapping("/04.3.9")
    public ModelAndView lesson04part3task9(){
        return new ModelAndView("lesson04part3/04.3.9");
    }
    @GetMapping("/04.3.10")
    public ModelAndView lesson04part3task10(){
        return new ModelAndView("lesson04part3/04.3.10");
    }
    @GetMapping("/04.3.11")
    public ModelAndView lesson04part3task11(){
        return new ModelAndView("lesson04part3/04.3.11");
    }
}


