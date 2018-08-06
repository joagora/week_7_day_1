package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

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

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }
}
