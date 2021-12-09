package config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name,
                        @RequestParam(value = "surname") String surname,
                        Model model) {

        model.addAttribute("message", "Hello, " +
                name + " " + surname);
        return "hello";
    }

    @GetMapping("/bye")
    public String goodbye(Model model) {
        String name = "paul";
        String surname = "stanly";
        model.addAttribute("message", name + " " + surname);
        return "bye";
    }

    @GetMapping("calc")
    public String calc(@RequestParam(value = "a") int a,
                       @RequestParam(value = "b") int b,
                       @RequestParam(value = "operation") String str,
                       Model model) {
        double result;
        switch (str) {
            case "mult":
                result = a * b;
                break;
            case "div":
                result = a/(double)b;
                break;
            case "sum":
                result = a+b;
                break;
            case "sub":
                result = a-b;
            default:
                result = 0;
        }
        model.addAttribute("result", result);
        return "calc";

    }
}
