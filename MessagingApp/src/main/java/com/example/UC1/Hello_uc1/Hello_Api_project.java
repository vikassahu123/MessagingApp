package com.example.UC1.Hello_uc1;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
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

    //UC3
    @GetMapping("/query/{name}")
    public String sayHey(@PathVariable String name)
    {
        return "Hello  "+name+" bro " + " !";//localhost:8080/api/query/vikas
    }


    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user )
    {
       return " Hello "+user.getFirstName()+" "+user.getSecondName()+" From Bridgelab";

       //localhost:8080/api/post

       // {                                 // use postman for body
       //     "firstName" : "Vikas",
       //         "secondName" : "Sahu"
       // }
    }

    


}
