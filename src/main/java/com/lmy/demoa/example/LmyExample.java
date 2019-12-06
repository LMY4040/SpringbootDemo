package com.lmy.demoa.example;

import bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class LmyExample  {

    @Autowired
    @GetMapping(value = "/test")
    public Person test(){
        return new Person();
    }

    @GetMapping("/getInfo")
    public String getInfo(String name, Integer age){
        return name + ":" + age;
    }

    @ResponseBody
    @RequestMapping(value = "api/getpost",method = RequestMethod.POST)
    public String getpost(@RequestParam("test") int test){

        if (test >5 || test == 5){
            return "大于5 了";
        }else {
            return "小于5 了";
        }

    }

    @ResponseBody
    @RequestMapping(value = "api/hello",method = RequestMethod.POST)
    public String HelloWorld(){return "Hello World";}

    @ResponseBody
    @RequestMapping(value = "/getpostjson",method = RequestMethod.POST)
    public String getpostjson(@RequestParam("str") String str){
        PersonBean bean = new PersonBean();
        bean.setName(str);
        return bean.getAge();
    }


}
