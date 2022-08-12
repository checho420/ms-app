package com.example.app.controller;

import com.example.app.model.EmployeeModel;
import com.example.app.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ms-employee/")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

    /*

    @GetMapping(value = "hi", produces = "application/json")
    public String getEmployees() {
        return "Hola Mundo";
    }


    @GetMapping(value = "hi/{name}", produces = "application/json")
    public String getHelloWithName(@PathVariable String name) {
        return "Hola Mundo " + name;
    }

    */


    @GetMapping(value = "employees", produces = "application/json")
    public List<EmployeeModel>  getEmployed() {
        return employeeServices.employee();
    }


}
