package com.issell.springbootbasic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Ch02Controller {

    @GetMapping("/")
    public String index(Model model){
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍길동", 10));
        list.add(new Person("고길동", 20));
        list.add(new Person("최길동", 30));
        model.addAttribute("people", list);
        return "index";
    }

}
