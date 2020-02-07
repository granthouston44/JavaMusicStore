package instruments;

public class Guitar extends Instrument{

    public Guitar(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
    super(material,colour,type,factoryPrice,retailPrice);
    }


    public String play(){
        return "A really good song on guitar is thunderstruck.....";
    }

    public double calculateMarkUp(){
        return getRetailPrice() - getRetailPrice();
    }

}
