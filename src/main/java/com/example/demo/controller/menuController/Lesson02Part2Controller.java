package com.example.demo.controller.menuController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson02Part2Controller {
    @GetMapping("/02.2.1")
    public ModelAndView lesson02part2task1() {
        return new ModelAndView("lesson02part2/02.2.1");
    }

    @GetMapping("/02.2.2")
    public ModelAndView lesson02part2task2() {
        return new ModelAndView("lesson02part2/02.2.2");
    }

    @GetMapping("/02.2.3")
    public ModelAndView lesson02part2task3() {
        return new ModelAndView("lesson02part2/02.2.3");
    }

    @GetMapping("/02.2.4")
    public ModelAndView lesson02part2task4() {
        return new ModelAndView("lesson02part2/02.2.4");
    }

    @GetMapping("/02.2.5")
    public ModelAndView lesson02part2task5() {
        return new ModelAndView("lesson02part2/02.2.5");
    }

    @GetMapping("/02.2.6")
    public ModelAndView lesson02part2task6() {
        return new ModelAndView("lesson02part2/02.2.6");
    }

    @GetMapping("/02.2.7")
    public ModelAndView lesson02part2task7() {
        return new ModelAndView("lesson02part2/02.2.7");
    }

    @GetMapping("/02.2.8")
    public ModelAndView lesson02part2task8() {
        return new ModelAndView("lesson02part2/02.2.8");
    }

    @GetMapping("/02.2.9")
    public ModelAndView lesson02part2task9() {
        return new ModelAndView("lesson02part2/02.2.9");
    }

    @GetMapping("/02.2.10")
    public ModelAndView lesson02part2task10() {
        return new ModelAndView("lesson02part2/02.2.10");
    }

    @GetMapping("/02.2.11")
    public ModelAndView lesson02part2task11() {
        return new ModelAndView("lesson02part2/02.2.11");
    }

    @GetMapping("/02.2.12")
    public ModelAndView lesson02part2task12() {
        return new ModelAndView("lesson02part2/02.2.12");
    }
}
