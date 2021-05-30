import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
    return stock.size();
    }

    public void addStock(ISell stockItem) {
    stock.add(stockItem);
    }

    public void removeStock(ISell stockItem) {
        stock.remove(stockItem);
    }


//    public double stockTotalSaleValue() {
//
//    }

//    public double stockTotalProfitPotential() {
//
//    }





}
