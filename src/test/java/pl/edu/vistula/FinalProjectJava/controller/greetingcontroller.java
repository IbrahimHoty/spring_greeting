package pl.edu.vistula.FinalProjectJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class greetingcontroller {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="ibra", required=false, defaultValue="Guest") String name, Model model) {
        model.addAttribute("ibra", name);
        return "greeting"; // returns greeting.html
    }
}

