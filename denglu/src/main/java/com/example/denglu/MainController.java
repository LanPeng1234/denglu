package com.example.denglu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("main")
    public String main(){
        return "main";
    }
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }
}
