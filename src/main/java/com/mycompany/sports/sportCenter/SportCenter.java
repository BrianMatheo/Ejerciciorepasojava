package com.mycompany.sports.sportCenter;

import com.mycompany.sports.people.TypePerson;
import java.util.ArrayList;

public class SportCenter {
    private String name;
    private String location;
    private String schedule;
    
    private ArrayList <Scenary> scenaries = new ArrayList<>();

    public SportCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void AddScenary(Scenary scenary){
        this.scenaries.add(scenary);
    }
    
    public void reservScenary(TypePerson type, Scenary scenary) throws Exception{
        if(type == TypePerson.COACH || type == TypePerson.SPORTSMAN){
            int index = this.scenaries.indexOf(scenary);
            if(index != -1){
                Scenary sc = this.scenaries.get(index);
                if(sc.isAvailable()){
                    sc.setAvailable(false);
                    System.out.println("Escenario Reservado");
                }else{
                    throw new Exception("El escenario no está disponible");
                }
            }
        }
    }
}
