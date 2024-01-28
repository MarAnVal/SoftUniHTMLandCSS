package com.example.demo.controller.menuController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lesson04Part2Controller {
    @GetMapping("/04.2.1")
    public ModelAndView lesson04part2task1() {
        return new ModelAndView("lesson04part2/04.2.1");
    }

    @GetMapping("/04.2.2")
    public ModelAndView lesson04part2task2() {
        return new ModelAndView("lesson04part2/04.2.2");
    }

    @GetMapping("/04.2.3")
    public ModelAndView lesson04part2task3() {
        return new ModelAndView("lesson04part2/04.2.3");
    }

    @GetMapping("/04.2.4")
    public ModelAndView lesson04part2task4() {
        return new ModelAndView("lesson04part2/04.2.4");
    }

    @GetMapping("/04.2.5")
    public ModelAndView lesson04part2task5() {
        return new ModelAndView("lesson04part2/04.2.5");
    }

    @GetMapping("/04.2.6")
    public ModelAndView lesson04part2task6() {
        return new ModelAndView("lesson04part2/04.2.6");
    }

    @GetMapping("/04.2.7")
    public ModelAndView lesson04part2task7() {
        return new ModelAndView("lesson04part2/04.2.7");
    }

    @GetMapping("/04.2.8")
    public ModelAndView lesson04part2task8() {
        return new ModelAndView("lesson04part2/04.2.8");
    }

    @GetMapping("/04.2.9")
    public ModelAndView lesson04part2task9() {
        return new ModelAndView("lesson04part2/04.2.9");
    }

    @GetMapping("/04.2.10")
    public ModelAndView lesson04part2task10() {
        return new ModelAndView("lesson04part2/04.2.10");
    }

    @GetMapping("/04.2.11")
    public ModelAndView lesson04part2task11() {
        return new ModelAndView("lesson04part2/04.2.11");
    }

    @GetMapping("/04.2.12")
    public ModelAndView lesson04part2task12() {
        return new ModelAndView("lesson04part2/04.2.12");
    }
}

