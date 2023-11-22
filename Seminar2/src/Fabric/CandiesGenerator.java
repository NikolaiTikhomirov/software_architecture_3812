package Fabric;

import Interface.iGameItem;
import Product.Candies;

public class CandiesGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Candies();
    }
    
}
