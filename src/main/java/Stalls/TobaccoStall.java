package Stalls;

import Visitors.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice(){
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
