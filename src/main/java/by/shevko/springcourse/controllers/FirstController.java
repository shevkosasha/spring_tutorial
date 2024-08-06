package by.shevko.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println(String.format("Hello, %s %s", name, surname));
        return "first/hello";
    }

    @GetMapping("/hello1")
    public String helloPage1(@RequestParam("name") String name,
                             @RequestParam(value = "surname", required = false) String surname){
        System.out.println(String.format("Hello, %s %s! It's a Spring area!", name, surname));
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}