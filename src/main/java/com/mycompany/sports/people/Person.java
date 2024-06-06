package com.mycompany.sports.people;

import com.mycompany.sports.sportCenter.Scenary;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private String ID;
    private TypePerson type;

    public Person(String name, String lastname, int age, String ID, TypePerson type) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.ID = ID;
        this.type = type;
    }

    public TypePerson getType() {
        return type;
    }

}
