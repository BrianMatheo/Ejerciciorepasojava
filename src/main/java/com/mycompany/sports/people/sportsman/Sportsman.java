package com.mycompany.sports.people.sportsman;

import com.mycompany.sports.people.Person;
import com.mycompany.sports.people.TypePerson;
import com.mycompany.sports.sportCenter.Sport;

public class Sportsman extends Person implements Doping, Feeding{
    private Sport sport;
    public Sportsman(String name, String lastname, int age, String ID, Sport sport) {
        super(name, lastname, age, ID, TypePerson.SPORTSMAN);
        this.sport = sport;
    }

    @Override
    public void doTest() {
        System.out.println("Hacer prueba de sangre");
    }

    @Override
    public void diet() {
        if(this.sport == sport.FOOTBALL){
        System.out.println("Estoy haciendo dieta futbolera");
        }else if(this.sport == sport.BASKETBALL){
        System.out.println("Estoy haciendo dieta basquetbolera");
        }else if(this.sport == sport.TENNIS){
        System.out.println("Estoy haciendo dieta tenisera");
        }
    }
    
    
}
