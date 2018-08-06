package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed {
    public Dodgems(String name){
        super(name);
    }

    @Override
    public double defaultPrice(){
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor){
        double price;
        if (visitor.getAge() < 12) {
            price = defaultPrice() / 2;
        } else {
            price = defaultPrice();
        }
        return price;
    }
}
