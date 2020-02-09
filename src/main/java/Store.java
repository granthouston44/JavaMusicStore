import behaviours.ISell;

import java.util.ArrayList;

public class Store {

    private ArrayList<ISell> stock;
    private double till;

    public Store(){
        this.stock = new ArrayList<ISell>();
        this.till = 0;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void addToStock(ISell stockITem){
        stock.add(stockITem);
    }

    public void removeFromStock(ISell stockITem){
        stock.remove(stockITem);
    }

    public double calcMarkUpPotential(){
        double total = 0;
        for(int i =0; i < stock.size(); i++){
            ISell currentItem = stock.get(i);
            total += currentItem.calculateMarkUp();
        }
        return total;
    }


}
