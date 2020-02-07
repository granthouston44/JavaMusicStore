package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    protected String name;
    protected double factoryPrice;
    protected double retailPrice;
    protected String description;


    public Accessory(String name, double factoryPrice, double retailPrice, String description){
        this.name = name;
        this.factoryPrice = factoryPrice;
        this.retailPrice = retailPrice;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public double calculateMarkUp(){
        return this.getRetailPrice() - this.getRetailPrice();
    }


}
