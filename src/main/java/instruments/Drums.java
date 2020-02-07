package instruments;

public class Drums extends Instrument{

    private String kitStyle;

    public Drums(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice, String kitStyle){
        super(material, colour, type, factoryPrice, retailPrice);
        this.kitStyle = kitStyle;
    }

    public String play(){
        return "Ba dum tshh";
    }

    public double calculateMarkUp(){
        return this.getRetailPrice() - this.getRetailPrice();
    }



}
