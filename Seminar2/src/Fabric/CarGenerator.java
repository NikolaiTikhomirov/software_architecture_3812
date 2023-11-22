package Fabric;

import Interface.iGameItem;
import Product.Car;

public class CarGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Car();
    }
    
}
