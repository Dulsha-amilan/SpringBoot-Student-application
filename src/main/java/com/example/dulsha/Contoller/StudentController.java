package com.example.dulsha.Contoller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="api/v1/user")
@CrossOrigin
public class StudentController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple boot";
    }

}
