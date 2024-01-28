package com.example.demo.controller.menuController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson02Part3Controller {
    @GetMapping("/02.3.1")
    public ModelAndView lesson02part3task1() {
        return new ModelAndView("lesson02part3/02.3.1");
    }

    @GetMapping("/02.3.2")
    public ModelAndView lesson02part3task2() {
        return new ModelAndView("lesson02part3/02.3.2");
    }

    @GetMapping("/02.3.3")
    public ModelAndView lesson02part3task3() {
        return new ModelAndView("lesson02part3/02.3.3");
    }

    @GetMapping("/02.3.4")
    public ModelAndView lesson02part3task4() {
        return new ModelAndView("lesson02part3/02.3.4");
    }

    @GetMapping("/02.3.5")
    public ModelAndView lesson02part3task5() {
        return new ModelAndView("lesson02part3/02.3.5");
    }

    @GetMapping("/02.3.6")
    public ModelAndView lesson02part3task6() {
        return new ModelAndView("lesson02part3/02.3.6");
    }

    @GetMapping("/02.3.7")
    public ModelAndView lesson02part3task7() {
        return new ModelAndView("lesson02part3/02.3.7");
    }

    @GetMapping("/02.3.8")
    public ModelAndView lesson02part3task8() {
        return new ModelAndView("lesson02part3/02.3.8");
    }

    @GetMapping("/02.3.9")
    public ModelAndView lesson02part3task9() {
        return new ModelAndView("lesson02part3/02.3.9");
    }

    @GetMapping("/02.3.10")
    public ModelAndView lesson02part3task10() {
        return new ModelAndView("lesson02part3/02.3.10");
    }

    @GetMapping("/02.3.11")
    public ModelAndView lesson02part3task11() {
        return new ModelAndView("lesson02part3/02.3.11");
    }
}
