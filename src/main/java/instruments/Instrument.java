package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private double factoryPrice;
    private double retailPrice;

    public Instrument(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.factoryPrice = factoryPrice;
        this.retailPrice = retailPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
