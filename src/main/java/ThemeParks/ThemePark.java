package ThemeParks;

import Attractions.Attraction;
import Stalls.Stall;
import Visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractionList;
    private ArrayList<Stall> stallList;
    private String name;

    public ThemePark(String name){
        this.name = name;
        this.attractionList = new ArrayList<>();
        this.stallList = new ArrayList<>();
    }

    public String visit(Visitor visitor, Attraction attraction){
        return visitor.getName() + " visited " + attraction.getName() + ".";
    }
}
