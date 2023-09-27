package se.distansakademin.codepipelinedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @GetMapping("/projects")
    public String getProjects(){
        return "projects";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
