package com.example.app.controllers;

import com.example.app.models.HelloModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms-hello/")
public class HelloController {

    @GetMapping(value = "hi", produces = "application/json")
    public String getHello() {
        return "Hola Mundo";
    }

    @GetMapping(value = "hi/{name}", produces = "application/json")
    public String getHelloWithName(@PathVariable String name) {
        return "Hola Mundo " + name;
    }

    @GetMapping(value = "obj", produces = "application/json")
    public HelloModel getObj() {
        return new HelloModel("Hola", "Mundo");
    }
}
