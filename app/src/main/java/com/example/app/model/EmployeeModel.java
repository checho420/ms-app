package com.example.app.model;

public class EmployeeModel {
    private String name;
    private int dni;
    private String lvl;

    public EmployeeModel(String name, int dni, String lvl) {
        this.name = name;
        this.dni = dni;
        this.lvl = lvl;
    }

    public EmployeeModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }
}
