package com.issell.springbootbasic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/gugudan")
    public String gugudanForm(){
        return "gugudan_form";
    }

    @PostMapping("/gugudan")
    public String gugudan(int dan, Model model) {
        model.addAttribute("dan", dan);
        return "gugudan_result";
    }
}
