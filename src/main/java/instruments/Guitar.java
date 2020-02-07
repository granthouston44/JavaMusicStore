package instruments;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(String material, String colour, InstrumentType type, double factoryPrice, double retailPrice){
    super(material,colour,type,factoryPrice,retailPrice);
    this.strings = 6;
    }


    public String play(){
        return "A really good song on guitar is thunderstruck.....";
    }

    public double calculateMarkUp(){
        return getRetailPrice() - getRetailPrice();
    }

}
