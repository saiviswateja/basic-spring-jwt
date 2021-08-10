package com.springsecurityjwt.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping({"/hello"})
    public @ResponseBody String hello()
    {
        return "Hello World";
    }

}
