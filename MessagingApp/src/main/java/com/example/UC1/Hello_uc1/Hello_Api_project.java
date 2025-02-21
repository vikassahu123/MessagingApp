package com.example.UC1.Hello_uc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_Api_project {

    @RequestMapping(value = {"/hello","/Hello","/UC1"})
    public String sayHello()
    {
        return "Hello from BridgeLab!!";
    }
    
}
