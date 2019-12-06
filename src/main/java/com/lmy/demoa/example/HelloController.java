package com.lmy.demoa.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @RequestMapping(value = "api/helloWorld")
    @ResponseBody
    private String HelloWord(){return "aaaaaaaaa";}


}
