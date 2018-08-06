package Attractions;

import Interfaces.IRating;

public abstract class Attraction implements IRating {
    private String name;
    private int rating;

    public Attraction(String name){
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getRating(){
        return this.rating;
    }
}


