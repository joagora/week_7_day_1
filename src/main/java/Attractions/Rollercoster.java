package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Rollercoster extends Attraction implements ITicketed {
    public Rollercoster(String name){
        super(name);
    }

    @Override
    public double defaultPrice(){
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor){
        double price;
        if (visitor.getHeight() >= 200){
            price = defaultPrice() * 2;
        } else {
            price = defaultPrice();
        }
        return price;
    }
}
