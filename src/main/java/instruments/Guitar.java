package instruments;

public class Guitar extends Instrument{

    public Guitar(String material, String colour, InstrumentType type, double buyPrice, double sellPrice){
    super(material,colour,type,buyPrice,sellPrice);
    }


    public String play(){
        return "A really good song on guitar is thunderstruck.....";
    }

}
