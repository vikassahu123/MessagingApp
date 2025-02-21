package com.example.UC1.Hello_uc1;

import org.springframework.web.bind.annotation.*;


@RestController

public class Hello_Api_project {

    //UC1
    @RequestMapping(value = {"/hello","/Hello","/UC1"})
    public String sayHello()
    {
        return "Hello from BridgeLab!!";
    }

    //UC2
    @RequestMapping(value={"/query"} ,method= RequestMethod.GET)
    public String sayHi(@RequestParam (value="name") String name)
    {

        return "Hello "+name+" ! ";//localhost:8080/query?name=vikas sahu

    }







}
