package instruments;

public class Drums extends Instrument{

    public Drums(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
        super(material, colour, type, factoryPrice, retailPrice);
    }

    public String play(){
        return "Ba dum tshh";
    }

    public double calculateMarkUp(){
        return this.getRetailPrice() - this.getRetailPrice();
    }

}
