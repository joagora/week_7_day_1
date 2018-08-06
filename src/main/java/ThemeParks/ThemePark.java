package ThemeParks;

import Attractions.Attraction;
import Interfaces.IRating;
import Interfaces.ITicketed;
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

    public ArrayList<Attraction> getAttractionList() {
        return attractionList;
    }

    public void addAttraction(Attraction attraction){
        attractionList.add(attraction);
    }
    public ArrayList<IRating> getAllRated(){
        ArrayList<IRating> ratedAttractions = new ArrayList<>();
        for (Attraction attraction: attractionList) {
            if (attraction instanceof IRating){
                ratedAttractions.add(attraction);
            }
        }
        return ratedAttractions;
    }
//not working
//    public ArrayList<ITicketed> getAllAttractionsAllowedFor(){
//        ArrayList<ITicketed> availableAttractions = new ArrayList<>();
//        for (Attraction attraction: attractionList) {
//            if (attraction instanceof ITicketed){
//                availableAttractions.add(attraction);
//            }
//        }
//    return availableAttractions;
//    }
}
