package com.sparta.springmvcpractice.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\" : \"jhwook\", \"age\" : 30}";
    }

    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson() {
        return new Star("jhwook", 30);
    }
}


