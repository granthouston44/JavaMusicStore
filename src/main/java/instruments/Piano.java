package instruments;

public class Piano extends Instrument{

    public Piano(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
        super(material, colour, type, factoryPrice, retailPrice);
        }


        public String play(){
        return "mario 64 jolly rancher bay theme";
        }

        public double calculateMarkUp(){
        return this.getRetailPrice() - this.getRetailPrice();
        }

}
