package com.mycompany.sports;

import com.mycompany.sports.people.coach.Coach;
import com.mycompany.sports.sportCenter.Scenary;
import com.mycompany.sports.sportCenter.Sport;
import com.mycompany.sports.sportCenter.SportCenter;

public class Sports {

    public static void main(String[] args) throws Exception {
        SportCenter sportCenter = new SportCenter("MegaParque", "Ocaña", "Todo el día");
        
        Scenary scenary = new Scenary("Polideportivo", Sport.TENNIS, 200);
        Scenary scenary1 = new Scenary("Cancha", Sport.FOOTBALL, 800);
        
        sportCenter.AddScenary(scenary);
        sportCenter.AddScenary(scenary1);
        
        Coach coach = new Coach("Pepa", "Pig", 8, "asd");
        try{
            sportCenter.reservScenary(coach.getType(), scenary);
            sportCenter.reservScenary(coach.getType(), scenary);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
