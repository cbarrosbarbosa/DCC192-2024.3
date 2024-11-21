package edu.dcc192.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "login.html";
    }

    @GetMapping("menu")
    public ModelAndView getMethodName(@RequestParam String name) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("userName", name); // Passa o nome como parâmetro para a página
        return mv;
    }
    
}