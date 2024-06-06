package com.mycompany.sports.people.coach;

import com.mycompany.sports.people.Person;
import com.mycompany.sports.people.TypePerson;
import com.mycompany.sports.sportCenter.Sport;

public class Coach extends Person{
    private Sport sport;
    private boolean available = true;

    public Coach(String name, String lastname, int age, String ID) {
        super(name, lastname, age, ID, TypePerson.COACH);
    }
    

    
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
