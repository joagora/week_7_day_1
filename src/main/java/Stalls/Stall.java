package Stalls;

import Interfaces.IRating;
import Interfaces.ITicketed;

public abstract class Stall implements ITicketed, IRating {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }

    @Override
    public int getRating(){
        return this.rating;
    }
}
