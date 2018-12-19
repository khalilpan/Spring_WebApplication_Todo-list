package com.khalilpan.config.Controller;

import com.khalilpan.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // means that this class is a web controller
public class DemoController {

    private final DemoServiceImpl demoService;

    @Autowired
    public DemoController(DemoServiceImpl demoService) {
        this.demoService = demoService;
    }

    //http://localhost:8080/todo-list/hello
    @ResponseBody
    //this annotation indicates that the value that is returning by this method should be bound to the web response body (instead of using View ,to show the result)
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //http://localhost:8080/todo-list/welcome
    //http://localhost:8080/todo-list/welcome?user=khalil
    @GetMapping("welcome") //it will use welcome.jsp
    public String welcome(@RequestParam String user, @RequestParam String age,Model model) {
//        model.addAttribute("user", "khalil");
        model.addAttribute("welcome2",demoService.getWelcomeMessage());
        model.addAttribute("hello2",demoService.getHelloMessage(user));
        model.addAttribute("age",age);
        //prefix + name + suffix
        //  /WEB-INF/view/welcome.jsp
        return "welcome"; //we should return the name of the created view(welcome.jsp)
    }

    @ModelAttribute("byeMessage")
    public String byeMessge() {
        return "bye bye for --> ";
    }


}
