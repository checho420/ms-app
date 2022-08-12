package com.example.app.service;

import com.example.app.model.EmployeeModel;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServicesImp implements EmployeeServices{

    List<EmployeeModel> employeesList = Arrays.asList(
            new EmployeeModel("emp1",111,"developer"),
            new EmployeeModel("emp1",222,"music"),
            new EmployeeModel("emp1",333,"skater"),
            new EmployeeModel("emp1",444,"bomber"),
            new EmployeeModel("emp1",555,"developer"),
            new EmployeeModel("emp1",666,"driver")
    );

    @Override
    public List<EmployeeModel> employee() {
        return employeesList;
    }
}
