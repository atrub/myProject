package com.alfabank;

import java.util.List;

public class Human {

    private String name;
    private List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}