package pl.edu.vistula.FinalProjectJava.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, this is my first Spring controller!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="ibra", required=false, defaultValue="Ibra") String name, Model model) {
        model.addAttribute("ibra", name);
        return "greeting"; // This will now render greeting.html
    }
}

