package instruments;


public class Bass extends Instrument {

    public Bass(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
        super(material, colour, type, factoryPrice, retailPrice);
    }


    public String play(){
        return "blink 182 i miss you intensifies";
    }


    public double calculateMarkUp(){
        return this.getRetailPrice() - this.getRetailPrice();
    }
}
