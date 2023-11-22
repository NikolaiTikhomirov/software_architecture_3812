package Fabric;

import Interface.iGameItem;
import Product.Chicken;

public class ChickenGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Chicken();
    }
    
}
